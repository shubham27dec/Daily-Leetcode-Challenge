public class October292023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
            int test = minutesToTest/minutesToDie;
            int pigs=0;
            while(Math.pow(test+1,pigs)<buckets){
                pigs++;
            }
            return pigs;
        }
    }
}
