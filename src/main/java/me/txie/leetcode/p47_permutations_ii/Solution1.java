/**
 * LeetCode - p47_permutations_ii
 */
package me.txie.leetcode.p47_permutations_ii;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

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
    private boolean finished = false;
    private List<List<Integer>> permutations = new ArrayList<>();

    @Override
    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] a = new int[nums.length + 1]; // 解从1开始
        AuxiliaryInfo info = new AuxiliaryInfo(nums);
        backtrack(a, 0, info);
        return permutations;
    }

    private void backtrack(int[] a, int k, AuxiliaryInfo info) { // info保存辅助信息
        if (isASolution(a, k, info)) { // a[1..k]是不是解？
            processSolution(a, k, info);
        } else {
            k++;
            List<Integer> candidates = constructCandidates(a, k, info);
            for (Integer i : candidates) {
                a[k] = i;
                makeMove(a, k, info);
                backtrack(a, k, info);
                if (finished)
                    return;
                unmakeMove(a, k, info);
            }
        }
    }

    private boolean isASolution(int[] a, int k, AuxiliaryInfo info) {
        return k == info.length;
    }

    private void processSolution(int[] a, int k, AuxiliaryInfo info) {
        List<Integer> list = Arrays.stream(a).skip(1) // 解从1开始
            .boxed().collect(Collectors.toList());
        permutations.add(list);
    }

    private List<Integer> constructCandidates(int[] a, int k, AuxiliaryInfo info) {
        Map<Integer, Long> groupByCount = new HashMap<>(info.groupByCount);

        for (int i = 1; i < k; i++) {
            if (groupByCount.containsKey(a[i])) {
                long count = groupByCount.get(a[i]);
                groupByCount.put(a[i], --count);
            }
        }

        List<Integer> candidates = new ArrayList<>();
        for (Integer key : groupByCount.keySet()) {
            if (groupByCount.get(key) > 0) {
                candidates.add(key);
            }
        }
        return candidates;
    }

    private void makeMove(int[] a, int k, AuxiliaryInfo info) {

    }

    private void unmakeMove(int[] a, int k, AuxiliaryInfo info) {

    }

    private class AuxiliaryInfo {
        private Map<Integer, Long> groupByCount;
        private int length;

        AuxiliaryInfo(int[] nums) {
            Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()));
            this.groupByCount = Collections.unmodifiableMap(map);
            this.length = nums.length;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        for (List<Integer> list : solution.permuteUnique(new int[]{1, 1, 1})) {
            list.forEach(System.out::print);
            System.out.println();
        }

    }
}
