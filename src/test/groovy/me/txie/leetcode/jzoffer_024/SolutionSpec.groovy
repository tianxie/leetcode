package me.txie.leetcode.jzoffer_024

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_024"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.reverseList(head) == expected

        where: "Samples"
        head                       || expected
        ListNode.of(1, 2, 3, 4, 5) || ListNode.of(5, 4, 3, 2, 1)
        ListNode.of(1, 2)          || ListNode.of(2, 1)
        ListNode.of()              || ListNode.of()
    }

}
