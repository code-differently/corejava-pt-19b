package com.codedifferently.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {
    @Test
    public void avengersAssembleTest01(){
        // Given
        Boolean dcHero = false;
        Boolean avengerHero = false;

        // When
        Boolean expected = true;
        Boolean actual = Problem.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avengersAssembleTest02(){
        // Given
        Boolean dcHero = false;
        Boolean avengerHero = true;

        // When
        Boolean expected = true;
        Boolean actual = Problem.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avengersAssembleTest03(){
        // Given
        Boolean dcHero = true;
        Boolean avengerHero = false;

        // When
        Boolean expected = false;
        Boolean actual = Problem.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avengersAssembleTest04(){
        // Given
        Boolean dcHero = true;
        Boolean avengerHero = true;

        // When
        Boolean expected = true;
        Boolean actual = Problem.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
