package me.txie.leetcode.p2_add_two_numbers

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class Solution1Spec extends Specification {
    def "AddTwoNumbers"() {
        given: "Solution1"
        def solution = new Solution1();

        expect: "Pass unit test"
        solution.addTwoNumbers(l1, l2) == expected

        where: "Samples"
        l1                      | l2                      || expected
        new ListNode([2, 4, 3]) | new ListNode([5, 6, 4]) || new ListNode([7, 0, 8])
    }
}
