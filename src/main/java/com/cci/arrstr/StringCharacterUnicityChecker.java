package com.cci.arrstr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCharacterUnicityChecker {

    public boolean checkWithMap(String input) {
        Map<Character, Integer> charOccurrence = new HashMap<>();
        for (Character character : input.toCharArray()) {
            if (charOccurrence.get(character) == null) {
                charOccurrence.put(character, 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean checkWithBitVector(String input) {
        int checker = 0;
        for (int i = 0; i < input.length(); ++i) {
            int val = input.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

    public boolean checkWithoutMap(String input) {
        char[] letters = input.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if ((i != j) && (letters[i] == letters[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWithSortingAndParsing(String input) {
        char[] letters = input.toCharArray();
        Arrays.sort(letters);
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] == letters[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
