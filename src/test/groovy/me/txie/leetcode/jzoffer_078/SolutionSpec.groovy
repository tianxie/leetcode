package me.txie.leetcode.jzoffer_078

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_078"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.mergeKLists(lists) == expected

        where: "Samples"
        lists                                                                         || expected
        [ListNode.of(1, 4, 5), ListNode.of(1, 3, 4), ListNode.of(2, 6)] as ListNode[] || ListNode.of(1, 1, 2, 3, 4, 4, 5, 6)
        [] as ListNode[]                                                              || ListNode.of()
        [ListNode.of()] as ListNode[]                                                 || ListNode.of()
    }

}
