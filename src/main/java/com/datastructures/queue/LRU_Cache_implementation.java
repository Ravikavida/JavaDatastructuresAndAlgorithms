package com.datastructures.queue;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class CacheEntry {
	int key;
	String value;

	CacheEntry(int key, String value) {
		this.key = key;
		this.value = value;
	}
}

public class LRU_Cache_implementation {

	Deque<CacheEntry> deque = new LinkedList<>();
	Map<Integer, CacheEntry> map = new HashMap<>();
	int CACHE_SIZE = 3;

	public String getFromCache(int key) {

		if (map.containsKey(key)) {
			CacheEntry entry = map.get(key);
			deque.remove(entry);
			deque.addFirst(entry);
			return entry.value;
		}
		return null;

	}

	public void putEntryinChache(int key, String value) {
		if (map.containsKey(key)) {
			CacheEntry entry = map.get(key);
			deque.remove(entry);
		} else {
			if (deque.size() == CACHE_SIZE) {
				CacheEntry lastEntry = deque.removeLast();
				map.remove(lastEntry.key);
			}
		}
		CacheEntry newEntry = new CacheEntry(key, value);
		deque.add(newEntry);
		map.put(key, newEntry);
	}

	public static void main(String[] args) {

		LRU_Cache_implementation cache = new LRU_Cache_implementation();
		cache.putEntryinChache(1, "Product-1-Info");
		cache.putEntryinChache(2, "Product-2-Info");
		cache.putEntryinChache(3, "Product-3-Info");
		cache.putEntryinChache(4, "Product-4-Info");

		System.out.println(cache.getFromCache(2));
		System.out.println(cache.getFromCache(6));
	}

}
