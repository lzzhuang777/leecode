package com.lzz.concurrency;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lzz
 * @version 1.0
 * @date 2021/3/9 14:15
 */
public class LRULinkedHashMap<K, V> extends LinkedHashMap<K, V> {

    private int Cache_Size;

    LRULinkedHashMap(int cacheSize){
        this.Cache_Size = cacheSize;
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K, V> eldest){
        return size()>Cache_Size;
    }

    public static void main(String[] args) {
        LRULinkedHashMap lruLinkedHashMap = new LRULinkedHashMap(4);
        lruLinkedHashMap.put(1,1);
        lruLinkedHashMap.put(2,2);
        lruLinkedHashMap.put(3,3);
        lruLinkedHashMap.put(4,4);
        lruLinkedHashMap.put(5,5);
        for(Iterator<Map.Entry<Integer,Integer>> it = lruLinkedHashMap.entrySet().iterator(); it.hasNext();){
            System.out.println(it.next().getKey());
        }
    }

}
