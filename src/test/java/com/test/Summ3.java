package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Summ3 {
    @ParameterizedTest
    @MethodSource("twoStrings")
    public void strings(String s1, String s2, int i, int j) {
        Assertions.assertEquals(s1, s2);
        Assertions.assertEquals(i, s2.length());
        Assertions.assertTrue(j > 0, "Больше нуля");
    }

    static Stream<Arguments> twoStrings() {

        return Stream.of(
                arguments("123", "123", 3, -1),
                arguments("123", "123", 3, 1)
        );
    }

}
