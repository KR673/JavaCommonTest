package com.wxb.commontest.modules.DesignMode.ProxyPattern.CGLibTest;

/**
 * @Description: 作用描述
 * @Author: WangXiaoBo
 * @Date: 2019/5/22 16:42
 * @Version: 1.0
 */
public class CGlibObject {
    public void output(){
        System.out.println("CGLIB");
        this.input();
        System.out.println("class : " + this.getClass());
    }
    public void input(){
        System.out.println("input");
    }
}
