class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3)
            return false;
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch))
                return false;
            if (Character.isLetter(ch)) {
                if("aeiou".contains(String.valueOf(Character.toLowerCase(ch))))
                    vowel++;
                else
                    consonant++;
            }
        }

        return vowel > 0 && consonant > 0;
    }
}