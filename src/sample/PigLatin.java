package sample;

public class PigLatin {
    static String translate(String input) {
        StringBuilder output = new StringBuilder();
        String[] words = input.split("\\.| ");

        for (String word : words) {
            output.append(translator(word)).append(" ");
        }

        return output.toString();
    }

    private static String translator(String input) {
        int index = 0;

        if (input.isBlank())
            return "";

        for (int i = 0; i < input.length(); i++) {
            if (isVowel(input.charAt(i))) {
                index = i;
                break;
            }
        }

        if (index == 0)
            return input + "way";

        return input.substring(index) + input.substring(0, index) + "ay";

    }


    private static boolean isVowel(char input) {
        String vowels = "aeiouyAEIOUY";
        return vowels.indexOf(input) >= 0;
    }


}