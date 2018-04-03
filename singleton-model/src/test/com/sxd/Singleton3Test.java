package test.com.sxd;

import com.sxd.Singleton3;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shixiaodong
 * @date 2018/4/3 0:15
 */


class MyThread extends Thread {
    public void run() {
        System.out.println(Singleton3.getInstance());
    }
}


public class Singleton3Test {
    @Test
    public void getInstance() throws Exception {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        m1.run();
        System.out.println("---------");
        m2.run();


    }

}