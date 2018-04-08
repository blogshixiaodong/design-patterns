package test.com.sxd.demo;

import com.sxd.demo.AbstractDisplay;
import com.sxd.demo.CharDisplay;
import com.sxd.demo.StringDisplay;

import static org.junit.Assert.*;

/**
 * @author Shixiaodong
 * @date 2018/4/8 23:23
 */
public class AbstractDisplayTest {

    private AbstractDisplay charDisplay = new CharDisplay();

    private AbstractDisplay stringDisplay = new StringDisplay();

    @org.junit.Test
    public void display() throws Exception {
        charDisplay.display();

        stringDisplay.display();

    }

}