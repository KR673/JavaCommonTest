package com.wxb.commontest.modules.DesignMode.ProxyPattern.JDKTest;

import java.lang.reflect.Proxy;

/**
 * @Description: JDK Proxy
 * @Author: WangXiaoBo
 * @Date: 2019/5/22 14:06
 * @Version: 1.0
 */
public class TestStart {
    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        TestInterface testInterface = new TestInterfaceImpl();

        TestInterface o = (TestInterface)Proxy.newProxyInstance(TestInterface.class.getClassLoader(),
                new Class[]{TestInterface.class}, new TestPorxy(testInterface));
        o.save();
    }
}
