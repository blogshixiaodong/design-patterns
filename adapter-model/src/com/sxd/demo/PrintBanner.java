package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/7 23:14
 */

/*
* 和代理有些类似，但是这里使通过继承目标类，实现需要的接口实现代理
* 而代理不会将接口方法暴露给用户，也就是我要实现printWeak，但是代理对外开放的方法依旧是showWithParen,只是在内部做了一些处理
* 也可以在类内实例化Banner对象，只要实现目标接口即可，这个方法可以减少类间的依赖性
* */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        System.out.println("Weak:");
        showWithParen();
    }

    @Override
    public void printStrong() {
        System.out.println("Strong:");
        showWithAster();
    }



}
