package hello.DI.bean_autowiring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DependsOnDemo {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

        ctx.load("classpath:app-context-annotation.xml");
        ctx.refresh();

        Singer johnMayer = ctx.getBean("johnMayer", Singer.class);
        johnMayer.sing();

    }
}
