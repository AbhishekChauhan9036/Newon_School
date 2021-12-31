static int focal_length(int R, char M)
{
   if(M=='(')
   {
     return R/2;
   }

   else
   {
     int x=-(R+1);
     return x/2;
   }
}