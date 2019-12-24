package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Summ2 {
    @ParameterizedTest
    @ValueSource(ints = {1,-2,3})
    public void chekNumbers(int i){
        Assertions.assertTrue(i>0);
    }

}
