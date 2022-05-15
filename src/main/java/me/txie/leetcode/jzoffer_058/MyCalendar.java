package me.txie.leetcode.jzoffer_058;

import java.util.Map;
import java.util.TreeMap;

public class MyCalendar {
    private final TreeMap<Integer, Integer> events;

    public MyCalendar() {
        this.events = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> floor = events.floorEntry(start);
        if (floor != null && floor.getValue() > start) {
            return false;
        }

        Map.Entry<Integer, Integer> ceiling = events.ceilingEntry(start);
        if (ceiling != null && ceiling.getKey() < end) {
            return false;
        }

        events.put(start, end);
        return true;
    }

    /**
     * Your MyCalendar object will be instantiated and called as such:
     * MyCalendar obj = new MyCalendar();
     * boolean param_1 = obj.book(start,end);
     */
    public static void main(String[] args) {

    }
}

