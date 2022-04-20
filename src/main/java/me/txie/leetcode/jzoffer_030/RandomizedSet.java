package me.txie.leetcode.jzoffer_030;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/insert-delete-getrandom-o1/
 */
public class RandomizedSet {
    private final List<Integer> nums;
    private final Map<Integer, Integer> numToIndex;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        nums = new ArrayList<>();
        numToIndex = new HashMap<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (numToIndex.containsKey(val)) {
            return false;
        }

        nums.add(val);
        numToIndex.put(val, nums.size() - 1);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!numToIndex.containsKey(val)) {
            return false;
        }

        // 与数组最后一个元素交换
        Integer index = numToIndex.get(val);
        int lastIndex = nums.size() - 1;
        // 下面两行的顺序不能错，否则在数组只有一个元素的情况下会出错
        numToIndex.put(nums.get(lastIndex), index);
        numToIndex.remove(val);
        nums.set(index, nums.get(lastIndex));
        nums.remove(lastIndex);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        Random random = new Random();
        int index = random.nextInt(nums.size());
        return nums.get(index);
    }

    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        System.out.println(set.remove(0));
        System.out.println(set.remove(0));
        System.out.println(set.insert(0));
        System.out.println(set.getRandom());
        System.out.println(set.remove(0));
        System.out.println(set.insert(0));
    }
}
