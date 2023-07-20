import java.util.Stack;

public class July202023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> asteroidStack = new Stack<>();
            for(int i=0; i<asteroids.length; i++){
                while(!asteroidStack.isEmpty() && asteroids[i]<0 && asteroidStack.peek()>0){
                    int diff = asteroids[i] + asteroidStack.peek();
                    if(diff<0){
                        asteroidStack.pop();
                    }
                    else if(diff>0){
                        asteroids[i] = 0;
                    }
                    else{
                        asteroids[i] = 0;
                        asteroidStack.pop();
                    }
                }
                if(asteroids[i]!=0){
                    asteroidStack.push(asteroids[i]);
                }
            }
            int[] afterCollision = new int[asteroidStack.size()];
            for(int i=afterCollision.length-1; i>=0; i--){
                afterCollision[i] = asteroidStack.pop();
            }
            return afterCollision;
        }
    }
}
