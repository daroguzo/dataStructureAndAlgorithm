package algorithm.string;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (String s:
                skill_trees) {
            for (char c :
                    s.toCharArray()) {
                if (skill.indexOf(c) != -1) {
                    sb.append(c);
                }
            }
            if (compare(skill, sb.toString())) {
                answer++;
            }
            sb.setLength(0);
        }
        return answer;
    }

    private boolean compare(String skill, String sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (skill.charAt(i) != sb.charAt(i))
                return false;
        }
        return true;
    }
}
