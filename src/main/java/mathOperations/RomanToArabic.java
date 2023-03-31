package mathOperations;

import java.util.Map;

public class RomanToArabic {

        private static final Map<Character, Integer> ROMAN_NUMERAL_MAP = Map.of(
                'M', 1000,
                'D', 500,
                'C', 100,
                'L', 50,
                'X', 10,
                'V', 5,
                'I', 1
        );

    public static void main(String[] args) {

    }

        public static int decode(String roman) {
            int result = 0;
            for (int i = 0; i < roman.length(); i++) {
                char currentChar = roman.charAt(i);
                int currentValue = ROMAN_NUMERAL_MAP.get(currentChar);//get the current value

                if (i < roman.length() - 1) {
                    char nextChar = roman.charAt(i + 1);
                    int nextValue = ROMAN_NUMERAL_MAP.get(nextChar);

                    if (currentValue < nextValue) {
                        result -= currentValue;
                    } else {
                        result += currentValue;
                    }
                } else {
                    result += currentValue;
                }
            }
            return result;
        }

}
