package me.txie.leetcode.p1115_print_foobar_alternately;

import java.util.concurrent.Semaphore;

class FooBar {
    private int n;
    private final Semaphore semaphoreFoo;
    private final Semaphore semaphoreBar;

    public FooBar(int n) {
        this.n = n;
        this.semaphoreFoo = new Semaphore(1);
        this.semaphoreBar = new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphoreFoo.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            semaphoreBar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphoreBar.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            semaphoreFoo.release();
        }
    }
}
