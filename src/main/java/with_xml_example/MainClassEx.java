package with_xml_example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassEx {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CodeCreator cc = context.getBean("myCodeCreator", CodeCreator.class);

        System.out.println(cc.getClassCat().name);

    }

}
