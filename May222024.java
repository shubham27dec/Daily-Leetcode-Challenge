import java.util.ArrayList;
import java.util.List;

public class May222024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> partitions = new ArrayList<>();
            findPartitions(0,s,partitions,new ArrayList<>());
            return partitions;
        }

        void findPartitions(int index, String s, List<List<String>> partitions, List<String> partition){
            if(index==s.length()){
                partitions.add(new ArrayList<>(partition));
            }
            for(int i=index; i<s.length(); i++){
                if(isPalindrome(s.substring(index,i+1))){
                    partition.add(s.substring(index,i+1));
                    findPartitions(i+1,s,partitions,partition);
                    partition.remove(partition.size()-1);
                }
            }
        }

        boolean isPalindrome(String s){
            for(int i=0; i<s.length()/2; i++){
                if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                    return false;
                }
            }
            return true;
        }
    }
}
