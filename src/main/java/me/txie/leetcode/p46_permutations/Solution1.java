/**
 * Leetcode - p46_permutations
 */
package me.txie.leetcode.p46_permutations;

import java.util.*;
import java.util.stream.Collectors;

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
    public List<List<Integer>> permute(int[] nums) {
        int[] a = new int[nums.length];
        backtrack(a, 0, nums); //
        return permutations;
    }

    private void backtrack(int[] a, int k, int[] input) {
        int[] c = new int[input.length];
        if (is_a_solution(a, k, input)) { // a的前k个元素是不是解？
            process_solution(a, k, input);
        } else {
            k++;
            int n_candidates = construct_candidates(a, k - 1, input, c);
            for (int i = 0; i < n_candidates; i++) {
                a[k - 1] = c[i];
                make_move(a, k, input);
                backtrack(a, k, input);
                if (finished) return;
                unmake_move(a, k, input);
            }
        }
    }

    private boolean is_a_solution(int[] a, int k, int[] input) {
        return k == input.length;
    }

    private void process_solution(int[] a, int k, int[] input) {
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        permutations.add(list);
    }

    private int construct_candidates(int[] a, int k, int[] input, int[] c) {
        Set<Integer> in_perm = new HashSet<>();
        for (int i = 0; i < k; i++) {
            in_perm.add(a[i]);
        }
        int n_candidates = 0;
        for (int i = 0; i < input.length; i++) {
            if (!in_perm.contains(input[i])) {
                c[n_candidates] = input[i];
                n_candidates++;
            }
        }
        return n_candidates;
    }

    private void make_move(int[] a, int k, int[] input) {

    }

    private void unmake_move(int[] a, int k, int[] input) {

    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        for (List<Integer> list : solution.permute(new int[]{1, 2, 3})) {
            list.forEach(System.out::print);
            System.out.println();
        }

    }
}
