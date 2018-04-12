package test.com.sxd.demo;

import com.sxd.demo.Manager;
import com.sxd.demo.MessageBox;
import com.sxd.demo.Product;

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
        /*因为实现了clone，两个product是不同的对象，
         *至于内部的属性是否相同，需要看是否实现clone
        */
        System.out.println(product);

    }

}