function removeDuplicates(arr){

        var outputArray = [];
        var count = 0;
        var start = false;
          
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < outputArray.length; j++) {
                if ( arr[i] == outputArray[j] ) {
                    start = true;
                }
            }
            count++;
          
            if (count == 1 && start == false) {
                outputArray.push(arr[i]);
            }
            start = false;
            count = 0;
         }
         var outputint = "";
        for ( let i = 0; i < outputArray.length; i++){
         outputint += outputArray[i] + " ";
       
        }
         console.log(outputint);
   
}