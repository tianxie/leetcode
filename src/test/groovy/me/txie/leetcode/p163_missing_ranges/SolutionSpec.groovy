package me.txie.leetcode.p163_missing_ranges

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p163_missing_ranges"() {
        given: "Solution"
        Solution solution = new Solution1();
//        Solution solution = new Solution2();

        expect: "Pass unit test"
        solution.findMissingRanges(vals, start, end) == expected

        where: "Samples"
        vals                       | start | end || expected
        [] as int[]                | 0     | 99  || ["0->99"]
        [0, 1, 3, 50, 75] as int[] | 0     | 99  || ["2", "4->49", "51->74", "76->99"]
    }

}
