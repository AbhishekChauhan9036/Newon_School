function  lucky_sevens(array)
{ 

  for(let i = 0 ; i < array.length ;  i++)
  {
      if(array[i] + array[i+1] + array[i + 2] === 7 )
      {
        return console.log("true");
      }
  }
  return console.log("false")
}