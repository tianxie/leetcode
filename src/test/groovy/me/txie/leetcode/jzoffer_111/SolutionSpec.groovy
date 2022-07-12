package me.txie.leetcode.jzoffer_111

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_111"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.calcEquation(equations, values, queries) == expected

        where: "Samples"
        equations                              | values                      | queries                                                      || expected
        [["a", "b"], ["b", "c"]]               | [2.0, 3.0] as double[]      | [["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"]] || [6.00000, 0.50000, -1.00000, 1.00000, -1.00000] as double[]
        [["a", "b"], ["b", "c"], ["bc", "cd"]] | [1.5, 2.5, 5.0] as double[] | [["a", "c"], ["c", "b"], ["bc", "cd"], ["cd", "bc"]]         || [3.75000, 0.40000, 5.00000, 0.20000] as double[]
        [["a", "b"]]                           | [0.5] as double[]           | [["a", "b"], ["b", "a"], ["a", "c"], ["x", "y"]]             || [0.50000, 2.00000, -1.00000, -1.00000] as double[]
    }

}
