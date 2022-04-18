package me.txie.leetcode.jzoffer_027

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_027"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.isPalindrome(head) == expected

        where: "Samples"
        head                          || expected
        ListNode.of(1, 2, 3, 3, 2, 1) || true
        ListNode.of(1, 2)             || false
    }

}
