package me.txie.leetcode.jzoffer_037

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_037"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.asteroidCollision(asteroids) == expected

        where: "Samples"
        asteroids               || expected
        [5, 10, -5] as int[]    || [5, 10] as int[]
        [8, -8] as int[]        || [] as int[]
        [10, 2, -5] as int[]    || [10] as int[]
        [-2, -1, 1, 2] as int[] || [-2, -1, 1, 2] as int[]
    }

}
