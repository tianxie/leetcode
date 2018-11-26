/**
 * Leetcode - p922_sort_array_by_parity_ii
 */
package me.txie.leetcode.p922_sort_array_by_parity_ii;

import java.util.*;
import com.ciaoshen.leetcode.util.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Parameterized.class)
public class Tester {

    /**=========================== static for every test cases ============================== */

    // Solution instance to test
    private static Solution solution;
    // use this Object to print the log (call from slf4j facade)
    private static final Logger LOGGER = LoggerFactory.getLogger(TesterRunner.class);

    /** Execute once before any of the test methods in this class. */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        /* uncomment to switch solutions */
//        solution = new Solution1();
         solution = new Solution2();
    }

    /** Execute once after all of the test methods are executed in this class. */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {}

    /** Initialize test cases */
    @Parameters
    public static Collection<Object[]> testcases() {
        return Arrays.asList(new Object[][]{
                {new int[]{4, 2, 5, 7}, new int[]{4, 5, 2, 7}},
                {new int[]{648, 831, 560, 986, 192, 424, 997, 829, 897, 843}, new int[]{648, 831, 560, 997, 192, 897, 986, 829, 424, 843}}
        });
    }

    /**=========================== for each test case ============================== */

    /** 
     * Parameters for each test (initialized in testcases() method) 
     * You can change the type of parameters
     */
    private int[] A;
    private int[] expected;

    /** This constructor must be provided to run parameterized test. */
    public Tester(int[] A, int[] expected) {
           // initialize test parameters
        this.A = A;
        this.expected = expected;
    }

    /** Execute before each test method in this class is executed. */
    @Before
    public void setUp() throws Exception {}

    /** Executed as a test case. */
    @Test
    public void test() {

         int[] actual = solution.sortArrayByParityII(A);

         assertThat(actual, is(equalTo(expected)));

         if (LOGGER.isDebugEnabled()) {
             LOGGER.debug("pass unit test!");
         }
    }

    /** Execute after each test method in this class is executed. */
    @After
    public void tearDown() throws Exception {}

}
