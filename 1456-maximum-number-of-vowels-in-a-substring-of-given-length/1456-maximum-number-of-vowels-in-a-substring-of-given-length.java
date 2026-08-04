class Solution {
    public int maxVowels(String s, int k) {
        int l=0,r=0;
        int maxcount=0;
        int vcount=0;
        while( r < s.length()){
             char c =s.charAt(r);
             if(isvowel(c)) vcount++; //adding the rightmost charcter and checking whehter its a vowel or not;
             
             if(r-l+1 > k ){
                  char re = s.charAt(l);
                  if (isvowel(re)) vcount--;
                  l++;
                  
             }
             if(r-l+1 == k ){
                  maxcount= Math.max(maxcount,vcount);
             }
           
            
            r++;
        }
       return maxcount;
    }
    private boolean isvowel (char c){
        return  c=='a'|| 
                c=='e' || 
                c=='i' || 
                c=='o' || 
                c=='u' ;
    }
}