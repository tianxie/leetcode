/**
 * LeetCode - p78_subsets
 */
package me.txie.leetcode.p78_subsets;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */
class Solution1 implements Solution {

    private List<List<Integer>> subsets = new ArrayList<>();
    private boolean finished = false;

    @Override
    public List<List<Integer>> subsets(int[] nums) {
        boolean[] a = new boolean[nums.length + 1]; // 解从1开始
        backtrack(a, 0, nums);
        return subsets;
    }

    private void backtrack(boolean[] a, int k, int[] nums) {
        if (is_a_solution(a, k, nums)) {
            process_solution(a, k, nums);
        } else {
            k++;
            boolean[] c = new boolean[2];
            int n_candidates = construct_candidates(a, k, nums, c);
            for (int i = 0; i < n_candidates; i++) {
                a[k] = c[i];
                make_move(a, k, nums);
                backtrack(a, k, nums);
                if (finished) return;
                unmake_move(a, k, nums);
            }
        }
    }

    private boolean is_a_solution(boolean[] a, int k, int[] nums) {
        return k == nums.length;
    }

    private void process_solution(boolean[] a, int k, int[] nums) {
        List<Integer> list = IntStream.range(1, k + 1) // 解从1开始
            .filter(i -> a[i])
            .mapToObj(i -> nums[i - 1])
            .collect(Collectors.toList());
        subsets.add(list);
    }

    private int construct_candidates(boolean[] a, int k, int[] nums, boolean[] c) {
        c[0] = true;
        c[1] = false;
        return 2;
    }

    private void make_move(boolean[] a, int k, int[] nums) {

    }

    private void unmake_move(boolean[] a, int k, int[] nums) {

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        Solution solution = new Solution1();
        for (List<Integer> list : solution.subsets(nums)) {
            list.forEach(System.out::print);
            System.out.println();
        }
    }
}
