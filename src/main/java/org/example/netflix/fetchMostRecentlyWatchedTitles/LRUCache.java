package org.example.netflix.fetchMostRecentlyWatchedTitles;

import java.util.HashMap;

class LRUCache {
    int capacity;

    //LinkedListNode holds key and value pairs
    HashMap<Integer,LinkedListNode> cache;
    MyLinkedList cacheVals;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<Integer,LinkedListNode>(capacity);
        cacheVals = new MyLinkedList();
    }


    LinkedListNode Get(int key) {

        if(!cache.containsKey(key)){
            return null;
        }else{
            int value = cache.get(key).data; // erişilmek istenen key'ın datası hash mapten okunuyor ve sonra linkedlist manipule ediliyor
            cacheVals.removeNode(cache.get(key)); //erişilen elemanı siliyor
            cacheVals.insertAtTail(key, value); // ve kuyrugun sonuna yani most recently accessed'e ekliyor
            return cacheVals.getTail(); // most recently access dondürülüyor yani key
        }
    }

    void Set(int key, int value) {

        if(!cache.containsKey(key)){
            evictIfNeeded();
            cacheVals.insertAtTail(key, value);
            cache.put(key, cacheVals.getTail());
        }else{
            cacheVals.removeNode(cache.get(key));
            cacheVals.insertAtTail(key, value);
            cache.put(key, cacheVals.getTail());
        }
    }

    private void evictIfNeeded() {
        if(cacheVals.size >= capacity) {
            LinkedListNode node = cacheVals.removeHead();
            cache.remove(node.key);
        }
    }

    void print() {
        LinkedListNode curr = cacheVals.head;

        while(curr != null){
            System.out.print("(" + curr.key + "," + curr.data + ")");
            curr = curr.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        System.out.println("The most recently watched titles are: (key, value)");
        cache.Set(10,20);
        cache.print();

        cache.Set(15,25);
        cache.print();

        cache.Set(20,30);
        cache.print();

        cache.Set(25,35);
        cache.print();

        cache.Set(5,40);
        cache.print();

        cache.Get(25);
        cache.print();
    }
}
