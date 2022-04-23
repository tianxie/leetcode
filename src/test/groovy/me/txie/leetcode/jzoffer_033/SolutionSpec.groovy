package me.txie.leetcode.jzoffer_033

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_033"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.groupAnagrams(strs) == expected

        where: "Samples"
        strs                                                   || expected
        ["eat", "tea", "tan", "ate", "nat", "bat"] as String[] || [["eat", "tea", "ate"], ["bat"], ["tan", "nat"]]
        [""] as String[]                                       || [[""]]
        ["a"] as String[]                                      || [["a"]]
    }

}
