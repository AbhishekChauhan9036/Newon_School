static int calculator(char ch, int a, int b)
    {
        int result=0;
        switch(ch){
             case '+':
                 result=(a+b); break;
             case '-':
                 result=(a-b); break;
             case '*':
                 result=(a*b); break;
             case '/':
                 result=(a/b); break;
        }
        return result;
     }


//)
