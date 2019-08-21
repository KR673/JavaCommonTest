package com.wxb.commontest.modules;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 作用描述
 * @Author: WangXiaoBo
 * @Date: 2019/5/11 9:26
 * @Version: 1.0
 */
public class floatTest {
    public static void main(String[] args) {

        List<ParamOne> one = new ArrayList<>() {{
                add(new ParamOne("1"));
                add(new ParamOne("2"));
                add(new ParamOne("3"));
            } };

        List<ParamTwo> two = new ArrayList<>() {{
            add(new ParamTwo("1"));
            add(new ParamTwo("2"));
            add(new ParamTwo("3"));
        }};

    }
}

@Data
class ParamOne{

    public ParamOne(String age) {
        this.age = age;
    }

    private  String age;
}

@Data
class ParamTwo{

    public ParamTwo(String name) {
        this.name = name;
    }

    private  String name;
}