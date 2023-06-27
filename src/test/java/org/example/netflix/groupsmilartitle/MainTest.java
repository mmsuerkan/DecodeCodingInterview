package org.example.netflix.groupsmilartitle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void groupTitles() {
        String[] strs = {"duel","dule","speed","spede","deul","cars"};

        List<List<String>> actual = Main.groupTitles(strs);
        List<List<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList("duel","dule","deul")));
        expected.add(new ArrayList<>(Arrays.asList("speed","spede")));
        expected.add(new ArrayList<>(Arrays.asList("cars")));
        assertEquals(expected, actual);
    }
}