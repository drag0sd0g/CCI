package com.cci.arrstr;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {

    /*Implement algorithm to check if string has all unique characters*/
    @Test
    public void testCharacterUnicity(){
        StringCharacterUnicityChecker checker = new StringCharacterUnicityChecker();

        //with data structures
        assertTrue(checker.checkWithMap("abcdef"));
        assertFalse(checker.checkWithMap("aaa"));
        assertFalse(checker.checkWithMap("bab"));
        assertTrue(checker.checkWithMap("dragos"));

        //without data structures
        assertTrue(checker.checkWithoutMap("abcdef"));
        assertFalse(checker.checkWithoutMap("aaa"));
        assertFalse(checker.checkWithoutMap("bab"));
        assertTrue(checker.checkWithoutMap("dragos"));

        //with bit vector
        assertTrue(checker.checkWithBitVector("abcdef"));
        assertFalse(checker.checkWithBitVector("aaa"));
        assertFalse(checker.checkWithBitVector("bab"));
        assertTrue(checker.checkWithBitVector("dragos"));

        //with sorting and parsing
        assertTrue(checker.checkWithSortingAndParsing("abcdef"));
        assertFalse(checker.checkWithSortingAndParsing("aaa"));
        assertFalse(checker.checkWithSortingAndParsing("bab"));
        assertTrue(checker.checkWithSortingAndParsing("dragos"));
    }
}
