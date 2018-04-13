package test.com.sxd.demo;

import com.sxd.demo.CountDisplay;
import com.sxd.demo.Display;
import com.sxd.demo.StringDisplayImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shixiaodong
 * @date 2018/4/13 23:39
 */
public class DisplayTest {


    @Test
    public void display() {
        Display display = new Display(new StringDisplayImpl("shixiaodong"));
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("bridge model."));

        display.display();
        countDisplay.multiDisplay(2);
        countDisplay.display();

    }





}