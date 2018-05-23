package com.example.administrator.myapplicationsqs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018-05-23.
 */

public class getData {

        public static List<String> getGroupData() {
            List<String> Group = new ArrayList<>();
        Group.add("第一组");
            Group.add("第二组");
            Group.add("第三组");
            return  Group;
        }
        public static  List<List<String>>getChildData(){
            List<List<String>> Students=new ArrayList<>();
            List<String> item1=new ArrayList<>();
            item1.add("aaa");
            item1.add("bbb");
            item1.add("ccc");
            item1.add("ddd");
            Students.add(item1);

            List<String> item2=new ArrayList<>();
            item2.add("eee");
            item2.add("fff");
            item2.add("ggg");
            item2.add("hhh");
            Students.add(item2);

            List<String> item3=new ArrayList<>();
            item3.add("iii");
            item3.add("jjj");
            item3.add("kkk");
            item3.add("lll");
            Students.add(item3);

            return Students;

        }
}
