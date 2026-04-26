class Solution {
 
    public String removeOccurrences(String s, String part) {
       while(s.indexOf(part) !=-1){
        int ind = s.indexOf(part);
        s = s.substring(0,ind )   + s.substring(ind+part.length() );
       } 

       return s ;
    }
}
