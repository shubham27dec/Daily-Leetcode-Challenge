public class May032024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int compareVersion(String version1, String version2) {
            String[] revisions1 = version1.split("[.]");
            String[] revisions2 = version2.split("[.]");
            int i=0;
            while(i<revisions1.length && i<revisions2.length){
                String revision1 = revisions1[i];
                String revision2 = revisions2[i];
                while(revision1.length()<revision2.length()){
                    revision1 = "0" + revision1;
                }
                while(revision2.length()<revision1.length()){
                    revision2 = "0" + revision2;
                }
                for(int j=0; j<revision1.length(); j++){
                    if(revision1.charAt(j)<revision2.charAt(j)){
                        return -1;
                    }
                    if(revision1.charAt(j)>revision2.charAt(j)){
                        return 1;
                    }
                }
                i++;
            }
            while(i<revisions1.length){
                String revision1 = revisions1[i];
                for(int j=0; j<revision1.length(); j++){
                    if(revision1.charAt(j)!='0'){
                        return 1;
                    }
                }
                i++;
            }
            while(i<revisions2.length){
                String revision2 = revisions2[i];
                for(int j=0; j<revision2.length(); j++){
                    if(revision2.charAt(j)!='0'){
                        return -1;
                    }
                }
                i++;
            }
            return 0;
        }
    }
}
