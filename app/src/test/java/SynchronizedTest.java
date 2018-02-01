/**
 * javap -c -v  SynchronizedTest.class
 * 查看同步方法跟同步代码块jvm是如何处理的
 */
public class SynchronizedTest {

    public synchronized void doSth(){
        System.out.println("Hello World");
    }

    public void doSth1(){
        synchronized (SynchronizedTest.class){
            System.out.println("Hello World");
        }
    }
}
