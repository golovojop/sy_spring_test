package simple_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        /**
         * Я так понимаю, что в данном случае контекст спринга
         * будет формироваться по нашим аннотациям.
         * Альтернативный вариант - подложить xml и тогда
         * будет другой креатор контекста
         */
        ApplicationContext context = new AnnotationConfigApplicationContext("simple_example");

        Cat cat = context.getBean(Cat.class);
        Dog dog = context.getBean(Dog.class);

        System.out.println(cat.name);
        System.out.println(dog.name);
    }

}
