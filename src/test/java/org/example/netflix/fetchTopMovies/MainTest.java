package org.example.netflix.fetchTopMovies;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mergeKCounty() {


        LinkedListNode l1 = new LinkedListNode(1);
        l1.next = new LinkedListNode(4);
        l1.next.next = new LinkedListNode(5);

        LinkedListNode l2 = new LinkedListNode(1);
        l2.next = new LinkedListNode(3);
        l2.next.next = new LinkedListNode(4);

        LinkedListNode l3 = new LinkedListNode(2);
        l3.next = new LinkedListNode(6);

        LinkedListNode[] lists = new LinkedListNode[3];
        lists[0] = l1;
        lists[1] = l2;
        lists[2] = l3;

        LinkedListNode res = Main.mergeKCounty(List.of(lists));

        assertEquals(1, res.data);
        assertEquals(1, res.next.data);
        assertEquals(2, res.next.next.data);
        assertEquals(3, res.next.next.next.data);
        assertEquals(4, res.next.next.next.next.data);
        assertEquals(4, res.next.next.next.next.next.data);
        assertEquals(5, res.next.next.next.next.next.next.data);
        assertEquals(6, res.next.next.next.next.next.next.next.data);

    }

    @Test
    void merge2Country() {

            LinkedListNode l1 = new LinkedListNode(1);
            l1.next = new LinkedListNode(4);
            l1.next.next = new LinkedListNode(5);

            LinkedListNode l2 = new LinkedListNode(1);
            l2.next = new LinkedListNode(3);
            l2.next.next = new LinkedListNode(4);

            LinkedListNode res = Main.merge2Country(l1, l2);

            assertEquals(1, res.data);
            assertEquals(1, res.next.data);
            assertEquals(3, res.next.next.data);
            assertEquals(4, res.next.next.next.data);
            assertEquals(4, res.next.next.next.next.data);
            assertEquals(5, res.next.next.next.next.next.data);
    }
}