package me.txie.leetcode.p2_add_two_numbers

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {
    def "AddTwoNumbers"() {
        given: "Solution1"
        def solution = new Solution1();

        expect: "Pass unit test"
        solution.addTwoNumbers(l1, l2) == expected

        where: "Samples"
        l1                   | l2                   || expected
        ListNode.of(2, 4, 3) | ListNode.of(5, 6, 4) || ListNode.of(7, 0, 8)
        ListNode.of(9, 9, 9) | ListNode.of(1)       || ListNode.of(0, 0, 0, 1)
    }
}
