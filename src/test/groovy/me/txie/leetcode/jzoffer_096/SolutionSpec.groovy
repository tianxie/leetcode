package me.txie.leetcode.jzoffer_096

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_096"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.isInterleave(s1, s2, s3) == expected

        where: "Samples"
        s1      | s2      | s3           || expected
        "aabcc" | "dbbca" | "aadbbcbcac" || true
        "aabcc" | "dbbca" | "aadbbbaccc" || false
        ""      | ""      | ""           || true
    }

}
