package org.example.netflix.fetchMostRecentlyWatchedTitles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    @Test
    void get() {
        LRUCache cache = new LRUCache(3);
        cache.Set(10, 20);
        cache.Set(15, 25);
        cache.Set(20, 30);
        cache.Set(25, 35);
        cache.Set(30, 40);
        cache.Set(35, 45);
        cache.Set(40, 50);
        cache.Set(45, 55);
        cache.Set(50, 60);
        cache.Set(55, 65);
        cache.Set(60, 70);
        cache.Set(65, 75);
        cache.Set(70, 80);
        cache.Set(75, 85);
        cache.Set(80, 90);
        cache.Set(85, 95);
        cache.Set(90, 100);
        cache.Set(95, 105);
        cache.Set(100, 110);
        cache.Set(105, 115);
        cache.Set(110, 120);
        cache.Set(115, 125);
        cache.Set(120, 130);
        cache.Set(125, 135);
        cache.Set(130, 140);
        cache.Set(135, 145);
        cache.Set(140, 150);
        cache.Set(145, 155);
        cache.Set(150, 160);

        assertEquals(160, cache.Get(150));
        assertEquals(155, cache.Get(145));

    }
}