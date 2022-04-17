package me.txie.leetcode.jzoffer_026

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_026"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.reorderList(head) == expected

        where: "Samples"
        head                       || expected
        ListNode.of(1, 2, 3, 4)    || ListNode.of(1, 4, 2, 3)
        ListNode.of(1, 2, 3, 4, 5) || ListNode.of(1, 5, 2, 4, 3)
    }

}
