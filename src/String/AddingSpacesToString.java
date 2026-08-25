package String;

public class AddingSpacesToString {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();

        int j = 0;

        for (int i = 0; i < s.length(); i++) {

            if (j < spaces.length && i == spaces[j]) {
                result.append(" ");
                j++;
            }

            result.append(s.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};

        System.out.println(addSpaces(s, spaces));
    }
}
