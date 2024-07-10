public class July102024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minOperations(String[] logs) {
            int ops = 0;
            for(String log : logs){
                if(log.equals("../")){
                    ops = Math.max(0,ops-1);
                }
                else if(log.equals("./")){
                    continue;
                }
                else{
                    ops++;
                }
            }
            return ops;
        }
    }
}
