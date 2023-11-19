package add_binary_67;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder resultString = new StringBuilder();

        int aCharIndex = a.length() - 1;
        int bCharIndex = b.length() - 1;
        int saveNumber = 0;

        while (aCharIndex >= 0 && bCharIndex >= 0) {
            int aCharNumber = Character.getNumericValue(a.charAt(aCharIndex));
            int bCharNumber = Character.getNumericValue(b.charAt(bCharIndex));
            int resultNumber = aCharNumber + bCharNumber + saveNumber;
            resultString.append(resultNumber % 2);
            saveNumber = resultNumber / 2;
            aCharIndex--;
            bCharIndex--;
        }

        while (aCharIndex >= 0) {
            int aCharNumber = Character.getNumericValue(a.charAt(aCharIndex));
            int resultNumber = aCharNumber + saveNumber;
            resultString.append(resultNumber % 2);
            saveNumber = resultNumber / 2;
            aCharIndex--;
        }

        while (bCharIndex >= 0) {
            int bCharNumber = Character.getNumericValue(b.charAt(bCharIndex));
            int resultNumber = bCharNumber + saveNumber;
            resultString.append(resultNumber % 2);
            saveNumber = resultNumber / 2;
            bCharIndex--;
        }

        if (saveNumber == 1) {
            resultString.append(saveNumber);
        }

        return resultString.reverse().toString();
    }
}
