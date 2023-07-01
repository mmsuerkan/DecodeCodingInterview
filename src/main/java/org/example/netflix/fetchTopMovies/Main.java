package org.example.netflix.fetchTopMovies;

import java.util.List;

public class Main {

    public static LinkedListNode mergeKCounty(List<LinkedListNode> lists) {

        if (lists.size() > 0){
            LinkedListNode res = lists.get(0);

            for (int i = 1; i < lists.size(); i++)
                res = merge2Country(res, lists.get(i));

            return res;
        }
        return new LinkedListNode(-1);
    }

    public static LinkedListNode merge2Country(LinkedListNode l1, LinkedListNode l2) {

        LinkedListNode dummy = new LinkedListNode(-1);
        LinkedListNode prev = dummy;

        while (l1 != null && l2 != null){

            if(l1.data <= l2.data){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        if(l1 == null){
            prev.next = l2;
        }else{
            prev.next = l1;
        }



        return dummy.next;
    }
}
