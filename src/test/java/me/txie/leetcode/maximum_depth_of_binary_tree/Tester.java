/**
 * Leetcode - maximum_depth_of_binary_tree
 */
package me.txie.leetcode.maximum_depth_of_binary_tree;

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

    /**
     * =========================== static for every test cases ==============================
     */

    // Solution instance to test
    private static Solution solution;
    // use this Object to print the log (call from slf4j facade)
    private static final Logger LOGGER = LoggerFactory.getLogger(TesterRunner.class);

    /**
     * Execute once before any of the test methods in this class.
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        /* uncomment to switch solutions */
        solution = new Solution1();
        // solution = new Solution2();
    }

    /**
     * Execute once after all of the test methods are executed in this class.
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * Initialize test cases
     */
    @Parameters
    public static Collection<Object[]> testcases() {
        return Arrays.asList(new Object[][]{
                {makeTree(new Object[]{3, 9, 20, null, null, 15, 7}), 3}
        });
    }

    private static TreeNode makeTree(Object[] objects) {
        return makeTree(objects, 0);
    }

    private static TreeNode makeTree(Object[] objects, int i) {
        if (i < objects.length) {
            Object o = objects[i];
            if (o != null) {
                TreeNode node = new TreeNode((int) o);
                node.left = makeTree(objects, 2 * i + 1);
                node.right = makeTree(objects, 2 * i + 2);
                return node;
            }
        }
        return null;
    }

    /**=========================== for each test case ============================== */

    /**
     * Parameters for each test (initialized in testcases() method)
     * You can change the type of parameters
     */
    private TreeNode root;
    private int expected;

    /**
     * This constructor must be provided to run parameterized test.
     */
    public Tester(TreeNode root, int expected) {
        // initialize test parameters
        this.root = root;
        this.expected = expected;
    }

    /**
     * Execute before each test method in this class is executed.
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * Executed as a test case.
     */
    @Test
    public void test() {

        int actual = solution.maxDepth(root);

        assertThat(actual, is(equalTo(expected)));

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("pass unit test!");
        }
    }

    /**
     * Execute after each test method in this class is executed.
     */
    @After
    public void tearDown() throws Exception {
    }

}
