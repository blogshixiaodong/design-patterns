package test.com.sxd.demo;

import com.sxd.demo.Factory;
import com.sxd.demo.IDCardFactory;
import com.sxd.demo.Product;
import org.junit.Test;


/**
 * @author Shixiaodong
 * @date 2018/4/9 23:00
 */
public class FactoryTest {

    private Factory factory = new IDCardFactory();

    @Test
    public void create() throws Exception {
        Product product = factory.create("shixiaodong");
        product.use();

    }
}