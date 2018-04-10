package test.com.sxd.demo;

import com.sxd.demo.Manager;
import com.sxd.demo.MessageBox;
import com.sxd.demo.Product;

import static org.junit.Assert.*;

/**
 * @author Shixiaodong
 * @date 2018/4/10 21:57
 */
public class ManagerTest {

    private Manager manager = new Manager();

    private MessageBox messageBox = new MessageBox('*');

    @org.junit.Test
    public void register() throws Exception {
        manager.register("shixiaodong", messageBox);
    }

    @org.junit.Test
    public void create() throws Exception {
        manager.register("shixiaodong", messageBox);
        Product product = manager.create("shixiaodong");
        product.use("Hello World");
    }

}