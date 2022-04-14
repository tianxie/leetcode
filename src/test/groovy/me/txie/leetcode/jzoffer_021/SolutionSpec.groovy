package me.txie.leetcode.jzoffer_021

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_021"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.removeNthFromEnd(head, n) == expected

        where: "Samples"
        head                       | n || expected
        ListNode.of(1, 2, 3, 4, 5) | 2 || ListNode.of(1, 2, 3, 5)
        ListNode.of(1)             | 1 || null
        ListNode.of(1, 2)          | 1 || ListNode.of(1)
    }

}
