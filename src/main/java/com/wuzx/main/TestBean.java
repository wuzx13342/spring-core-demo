package com.wuzx.main;

import com.wuzx.entity.Person;
import com.wuzx.entity.Student;
import org.junit.Test;

public class TestBean {
    @Test
    public void func1(){
        BeanFactory bf= (BeanFactory) new ClassPathXmlApplicationContext("/src/main/resources/applicationContext.xml");
        Person s=(Person)bf.getBean("A");
        Person s1=(Person)bf.getBean("B");
        System.out.println(s==s1);
        System.out.println(s1);
        Student stu1=(Student) bf.getBean("A");
        Student stu2=(Student) bf.getBean("B");
        String name=stu1.getName();
        System.out.println(name);
        System.out.println(stu1==stu2);
    }
}
