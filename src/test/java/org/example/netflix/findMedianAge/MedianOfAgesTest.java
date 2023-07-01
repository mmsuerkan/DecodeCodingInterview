package org.example.netflix.findMedianAge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfAgesTest {

    @Test
    void findMedian() {

        MedianOfAges medianOfAges = new MedianOfAges();
        medianOfAges.insertNum(30);
        medianOfAges.insertNum(20);
        medianOfAges.insertNum(10);
        medianOfAges.insertNum(40);
        medianOfAges.insertNum(50);
        assertEquals(30.0, medianOfAges.findMedian());
        medianOfAges.insertNum(60);
        assertEquals(35.0, medianOfAges.findMedian());
        medianOfAges.insertNum(70);
        assertEquals(40.0, medianOfAges.findMedian());
        medianOfAges.insertNum(80);
        assertEquals(45.0, medianOfAges.findMedian());
        medianOfAges.insertNum(90);
        assertEquals(50.0, medianOfAges.findMedian());
        medianOfAges.insertNum(100);
        assertEquals(55.0, medianOfAges.findMedian());


    }
}