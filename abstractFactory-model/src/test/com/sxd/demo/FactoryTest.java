package test.com.sxd.demo;

import com.sxd.demo.Factory;
import com.sxd.demo.Link;
import com.sxd.demo.Tray;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shixiaodong
 * @date 2018/4/12 23:10
 */
public class FactoryTest {
    @Test
    public void getFactory() throws Exception {

        Factory factory = Factory.getFactory("com.sxd.demo.ListFactory");

        Link link = factory.createLink("shixiaodong", "www.shixiaodong.com");

        System.out.println(link.makeHTML());

        Tray tray = factory.createTray("shixiaodong");
        tray.add("Hello");
        tray.add("World");
        System.out.println(tray.makeHTML());

    }

}