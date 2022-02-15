function reverseWords(str){
 let strlen = str.length, result = "", reverseStr = "", reverseStrArr = [];
  for(let i = strlen-1; i >= 0; i--){
    reverseStr +=  str[i];
  }

    for(let j = 0; j < strlen; j++){
    if(reverseStr[j] == " "){
      reverseStrArr.push(result);
      result = "";
    }else{
      result += reverseStr[j];
      if(j + 1 == strlen){
        reverseStrArr.push(result);
        result = "";
      }
    }
  }

  for(let k=reverseStrArr.length - 1; k >= 0; k--){
    result += reverseStrArr[k] + " " ;
  }
  console.log(result.trim());
}
