package me.txie.leetcode.p1115_print_foobar_alternately

import spock.lang.Specification

class FooBarTest extends Specification {

    ByteArrayOutputStream out

    def setup() {
        out = new ByteArrayOutputStream()
        System.setOut(new PrintStream(out))
    }

    def "输出一次"() {
        given:
        def fb = new FooBar(1)

        when:
        def t1 = new Thread({ -> fb.foo({ -> print("foo") }) })
        def t2 = new Thread({ -> fb.bar({ -> print("bar") }) })
        t1.start()
        t2.start()
        t1.join()
        t2.join()

        then:
        out.toString() == "foobar"
    }

    def "输出两次"() {
        given:
        def fb = new FooBar(2)

        when:
        def t1 = new Thread({ -> fb.foo({ -> print("foo") }) })
        def t2 = new Thread({ -> fb.bar({ -> print("bar") }) })
        t1.start()
        t2.start()
        t1.join()
        t2.join()

        then:
        out.toString() == "foobarfoobar"
    }

    def cleanup() {
        System.setOut(System.out)
    }
}
