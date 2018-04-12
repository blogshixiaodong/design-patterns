package test.com.sxd.demo;

import com.sxd.demo.Builder;
import com.sxd.demo.Director;
import com.sxd.demo.TextBuilder;
import org.junit.Test;


/**
 * @author Shixiaodong
 * @date 2018/4/11 23:40t
 */
public class BuilderTest {

    @Test
    public void builder() throws Exception {
        Builder builder = new TextBuilder();

        Director director = new Director(builder);

        director.construct();
    }

}