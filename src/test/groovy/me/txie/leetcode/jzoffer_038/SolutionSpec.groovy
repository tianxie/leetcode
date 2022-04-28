package me.txie.leetcode.jzoffer_038

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_038"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.dailyTemperatures(temperatures) == expected

        where: "Samples"
        temperatures || expected
        [73,74,75,71,69,72,76,73] as int[] || [1,1,4,2,1,1,0,0] as int[]
        [30,40,50,60] as int[] || [1,1,1,0] as int[]
        [30,60,90] as int[] || [1,1,0] as int[]
    }
    
}
