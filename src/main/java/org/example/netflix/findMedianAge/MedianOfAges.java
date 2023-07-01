package org.example.netflix.findMedianAge;

import java.util.PriorityQueue;

public class MedianOfAges {

    PriorityQueue<Integer> smallList; //containing first half of numbers
    PriorityQueue<Integer> largeList; //containing second half of numbers

    public MedianOfAges() {
        smallList = new PriorityQueue<>((a, b) -> b - a);
        largeList = new PriorityQueue<>((a, b) -> a - b);
    }

    public void insertNum(int num) {
        if (smallList.isEmpty() || smallList.peek() >= num)
            smallList.add(num);
        else
            largeList.add(num);

        // either both the heaps will have equal number of elements or max-heap will have one
        // more element than the min-heap
        if (smallList.size() > largeList.size() + 1)
            largeList.add(smallList.poll());
        else if (smallList.size() < largeList.size())
            smallList.add(largeList.poll());
    }

    public double findMedian(){

        if(smallList.size() == largeList.size()){
            return (smallList.peek() + largeList.peek())/2.0;
        }else if(smallList.size() > largeList.size()){
            return smallList.peek();
        }else{
            return largeList.peek();
        }

    }

}
