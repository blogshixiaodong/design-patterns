package test.com.sxd.demo;

import com.sxd.demo.Print;
import com.sxd.demo.PrintBanner;

import static org.junit.Assert.*;

/**
 * @author Shixiaodong
 * @date 2018/4/7 23:21
 */
public class PrintBannerTest {
    @org.junit.Test
    public void printWeak() throws Exception {
        Print print = new PrintBanner("Test");
        print.printWeak();

    }

    @org.junit.Test
    public void printStrong() throws Exception {
        Print print = new PrintBanner("Test");
        print.printStrong();
    }

}