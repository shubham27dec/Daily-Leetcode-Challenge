import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class December152023 {
    public static void main(String[] args) {

    }
    class Solution {
        public String destCity(List<List<String>> paths) {
            Set<String> sources = new HashSet<>();
            Set<String> destinations = new HashSet<>();
            for(List<String> path : paths){
                sources.add(path.get(0));
                destinations.add(path.get(1));
            }
            for(String destination : destinations){
                if(!sources.contains(destination)){
                    return destination;
                }
            }
            return paths.get(paths.size()-1).get(1);
        }
    }
}
