public class August222023 {
    public static void main(String[] args) {

    }
    class Solution {
        public String convertToTitle(int columnNumber) {
            // Create an empty string for storing the characters...
            StringBuilder output = new StringBuilder();
            // Run a while loop while columnNumber is positive...
            while(columnNumber > 0) {
                // Subtract 1 from columnNumber...
                columnNumber--;
                // Get current character by doing modulo of columnNumber by 26...
                char c = (char) ((columnNumber % 26) + 'A');
                // Divide columnNumber by 26...
                columnNumber /= 26;
                // Append the character into output...
                output.append(c);
            }
            output.reverse();
            return output.toString();
        }
    }
}
