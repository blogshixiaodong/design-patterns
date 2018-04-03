package test.com.sxd;

import com.sxd.Singleton;

/**
 * @author Shixiaodong
 * @date 2018/4/2 23:53
 */
public class SingletonTest {
    @org.junit.Test
    public void getInstance() throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1 == s2) {
            System.out.println("相同");
            System.out.println(s1);
            System.out.println(s2);
        } else {
            System.out.println("不同对象");
        }
    }

}