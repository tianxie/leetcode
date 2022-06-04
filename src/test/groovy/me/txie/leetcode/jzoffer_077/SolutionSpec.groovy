package me.txie.leetcode.jzoffer_077

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_077"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.sortList(head) == expected

        where: "Samples"
        head                        || expected
        ListNode.of(4, 2, 1, 3)     || ListNode.of(1, 2, 3, 4)
        ListNode.of(-1, 5, 3, 4, 0) || ListNode.of(-1, 0, 3, 4, 5)
        ListNode.of()               || ListNode.of()
    }

}
