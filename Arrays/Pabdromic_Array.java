class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  int c=0;
                  for(int i=0;i<n;i++){
                      if(checkIfItIsPalindrome(Integer.toString(a[i]))){
                          ++c;
                      }
                      else{
                          c=c;
                      }
                      
                      
                  }
                   int ans=0;
                   if(c==n){
                       ans=1;
                   }
                   else{
                       ans=0;
                   }
                   return ans;
           }
           
     public static boolean checkIfItIsPalindrome(String ele){
         
         StringBuilder sb = new StringBuilder();
         for(int i=ele.length()-1;i>=0;i--){
             sb.append(ele.charAt(i));
         }
         return sb.toString()==ele;
         
     }
}
