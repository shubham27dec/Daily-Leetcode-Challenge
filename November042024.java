public class November042024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String compressedString(String word) {
            StringBuilder comp = new StringBuilder();
            StringBuilder wordie = new StringBuilder(word);
            while(wordie.length()>0){
                int count = 2;
                int index = 1;
                while(count<10 && index<wordie.length() && wordie.charAt(index)==wordie.charAt(0)){
                    index++;
                    count++;
                }
                comp.append(count-1);
                comp.append(wordie.charAt(0));
                wordie.delete(0,index);
            }
            return comp.toString();
        }
    }
}
