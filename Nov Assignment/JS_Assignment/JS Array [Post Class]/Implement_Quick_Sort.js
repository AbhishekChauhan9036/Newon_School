
var arr;
function swap(arr, leftIndex, rightIndex){
    var temp = arr[leftIndex];
    arr[leftIndex] = arr[rightIndex];
    arr[rightIndex] = temp;
}

function partition(arr, start, end) {
    var pivot   = arr[Math.floor((start + end) / 2)],
        i       = start, //left pointer
        j       = end; //right pointer
    while (i <= j) {
        while (arr[i] < pivot) {
            i++;
        }
        while (arr[j] > pivot) {
            j--;
        }
        if (i <= j) {
            swap(arr, i, j); 
            i++;
            j--;
        }
    }
    return i;
}
function quickSort(arr, start, end)
 {
     //Your code here  
    var index;
    let size = arr.length;
    if (arr.length > 1) {
        let index = partition(arr, start, end); 
        if (start < index - 1) { 
            quickSort(arr, start, index - 1);
        }
        if (index < end) { 
            quickSort(arr, index, end);
        }
    }
    return arr;
}
