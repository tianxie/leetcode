package ${packageName}.${problemName}

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "${problemName}"() {
        given: "Solution"
        Solution solution = new Solution1();
//        Solution solution = new Solution2();

        expect: "Pass unit test"

        where: "Samples"
        
    }
    
}
