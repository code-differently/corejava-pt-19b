package com.codedifferently.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void nearHundredTest01(){
        // Given
        int amount = 93;

        // When
        Boolean expected = true;
        Boolean actual = Problem.nearValue(amount);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nearHundredTest02(){
        // Given
        int amount = 90;

        // When
        Boolean expected = true;
        Boolean actual = Problem.nearValue(amount);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nearHundredTest03(){
        // Given
        int amount = 89;

        // When
        Boolean expected = false;
        Boolean actual = Problem.nearValue(amount);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
