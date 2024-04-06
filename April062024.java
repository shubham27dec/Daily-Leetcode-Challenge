public class April062024 {
    public static void main(String[] args) {
        class Solution {
            public String minRemoveToMakeValid(String s) {
                int count = 0;
                for(int i=0; i<s.length(); i++){
                    if(s.charAt(i)=='('){
                        count++;
                    }
                    else if(s.charAt(i)==')'){
                        if(count>0){
                            count--;
                        }
                        else{
                            s = s.substring(0,i) + s.substring(i+1,s.length());
                            i--;
                        }
                    }
                }
                for(int i=s.length()-1; i>=0; i--){
                    if(s.charAt(i)=='(' && count>0){
                        count--;
                        s = s.substring(0,i) + s.substring(i+1,s.length());
                    }
                }
                return s;
            }
        }
    }
}
