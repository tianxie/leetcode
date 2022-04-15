package me.txie.leetcode.jzoffer_023

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_023"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.getIntersectionNode(headA, headB) == expected

        where: "Samples"
        headA                      | headB                         || expected
        ListNode.of(4, 1, 8, 4, 5) | ListNode.of(5, 0, 1, 8, 4, 5) || ListNode.of(8, 4, 5)
        ListNode.of(0, 9, 1, 2, 4) | ListNode.of(3, 2, 4)          || ListNode.of(2, 4)
        ListNode.of(2, 6, 4)       | ListNode.of(1, 5)             || null
    }

}
