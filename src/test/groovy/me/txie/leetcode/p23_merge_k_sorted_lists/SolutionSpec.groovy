package me.txie.leetcode.p23_merge_k_sorted_lists

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p23_merge_k_sorted_lists"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.mergeKLists(lists).toString() == expected.toString()

        where: "Samples"
        lists                                                                         || expected
        [ListNode.of(1, 4, 5), ListNode.of(1, 3, 4), ListNode.of(2, 6)] as ListNode[] || ListNode.of(1, 1, 2, 3, 4, 4, 5, 6)
    }

}
