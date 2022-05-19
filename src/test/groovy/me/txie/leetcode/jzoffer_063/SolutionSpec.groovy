package me.txie.leetcode.jzoffer_063

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_063"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.replaceWords(dictionary, sentence) == expected

        where: "Samples"
        dictionary                    | sentence                                        || expected
        ["cat", "bat", "rat"]         | "the cattle was rattled by the battery"         || "the cat was rat by the bat"
        ["a", "b", "c"]               | "aadsfasf absbs bbab cadsfafs"                  || "a a b c"
        ["a", "aa", "aaa", "aaaa"]    | "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa" || "a a a a a a a a bbb baba a"
        ["catt", "cat", "bat", "rat"] | "the cattle was rattled by the battery"         || "the cat was rat by the bat"
        ["ac", "ab"]                  | "it is abnormal that this solution is accepted" || "it is ab that this solution is ac"
    }

}
