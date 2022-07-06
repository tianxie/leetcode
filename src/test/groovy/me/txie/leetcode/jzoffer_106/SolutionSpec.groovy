package me.txie.leetcode.jzoffer_106

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_106"() {
        given: "Solution"
//        Solution solution = new Solution1()
//        Solution solution = new Solution2()
        Solution solution = new Solution3()

        expect: "Pass unit test"
        solution.isBipartite(graph) == expected

        where: "Samples"
        graph || expected
        [[1,2,3],[0,2],[0,1,3],[0,2]] as int[][] || false
        [[1,3],[0,2],[1,3],[0,2]] as int[][] || true
        
    }
    
}
