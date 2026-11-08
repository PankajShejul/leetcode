class FooBar {
    private int n;
    private boolean flag = false;
    public FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.

            while(flag) wait();
        	printFoo.run();
            flag=true;
            notifyAll();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(!flag) wait();
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            flag=false;
            notifyAll();
        }
    }
}