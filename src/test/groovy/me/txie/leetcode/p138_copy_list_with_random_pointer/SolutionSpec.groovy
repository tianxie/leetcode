package me.txie.leetcode.p138_copy_list_with_random_pointer

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p138_copy_list_with_random_pointer"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.copyRandomList(head) == expected

        where: "Samples"
        head || expected
        
    }
    
}
