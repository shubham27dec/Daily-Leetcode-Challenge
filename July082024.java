import java.util.ArrayList;
import java.util.List;

public class July082024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int findTheWinner(int n, int k) {
            List<Integer> friends = new ArrayList<>();
            for(int i=1; i<=n; i++){
                friends.add(i);
            }
            int currInd = 0;
            while(friends.size()>1){
                int eleInd = (currInd + k -1)%friends.size();
                friends.remove(eleInd);
                currInd = eleInd;
            }

            return friends.get(0);
        }
    }
}
