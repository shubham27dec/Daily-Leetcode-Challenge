import java.util.Arrays;

public class October042024 {
    public static void main(String[] args) {

    }
    class Solution {
        public long dividePlayers(int[] skill) {
            Arrays.sort(skill);
            long teamChemistry = 0;
            int commonSkill = skill[0] + skill[skill.length-1];
            for(int i=0; i<skill.length/2; i++){
                if(commonSkill != skill[i] + skill[skill.length-1-i]){
                    return -1;
                }
                teamChemistry += (skill[i] * skill[skill.length-1-i]);
            }
            return teamChemistry;
        }
    }
}
