package org.example.netflix.popularityAnalysis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void isMonotonic() {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        assertTrue(Solution.isMonotonic(arr));
        int [] arr2 = {10,9,8,7,6,5,4,3,2,1};
        assertTrue(Solution.isMonotonic(arr2));
        int [] arr3 = {1,2,3,4,5,6,7,8,9,10,9};
        assertFalse(Solution.isMonotonic(arr3));
        int [] arr4 = {10,9,8,7,6,5,4,3,2,1,2};
        assertFalse(Solution.isMonotonic(arr4));


    }
}