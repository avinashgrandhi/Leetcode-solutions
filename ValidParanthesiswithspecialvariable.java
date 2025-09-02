class Solution {
    public boolean checkValidString(String s) {

        int low=0;
        int high=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                low++;
                high++;
            }
            else if(c==')'){
                low--;
                high--;

            }
            else{
                low--;
                high++;
            }   

            if(low<0){
                low=0;
            }
            if(high<0){
                return false;
            }

              }
        if(low==0){
            return true;
        }
             return false;
    }
}
