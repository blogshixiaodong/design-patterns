package test.com.sxd.demo;

import com.sxd.demo.Bean;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shixiaodong
 * @date 2018/4/10 22:21
 */
public class BeanTest {

    private Bean bean = new Bean();


    @Test
    public void cloneStringTest() throws Exception {

        bean.setName("shixiaodong");

        Bean cloneBean = (Bean)bean.getClone();

        //String指向的是常量区，输出相同
        System.out.println(cloneBean.getName());
        System.out.println(bean.getName());

        //这里修改的是String的引用，不是修改引用的值，所以对cloneBean不影响
        bean.setName("sxd");

        //输出不同
        System.out.println(cloneBean.getName());
        System.out.println(bean.getName());
    }

    @Test
    public void cloneListTest() {

        bean.getInnerClass().setTest("shixiaodong");

        //
        Bean cloneBean = (Bean)bean.getClone();
        System.out.println(bean.getInnerClass().getTest());
        System.out.println(cloneBean.getInnerClass().getTest());

        //复制的是引用，所以原bean的值改变，clone的对象也随之改变
        bean.getInnerClass().setTest("sxd");
        System.out.println(bean.getInnerClass().getTest());
        System.out.println(cloneBean.getInnerClass().getTest());

    }



}