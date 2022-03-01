package hello.DI.bean_autowiring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CTarget {

    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;

    public CTarget() {
    }

    public CTarget(Foo foo) {
        System.out.println("Target(Foo) 호출");
    }

    public CTarget(Foo foo, Bar bar) {
        System.out.println("Target(Foo, Bar) 호출");
    }

    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("프로퍼티 fooOne 설정");
    }

    public void setFooTwo(Foo fooTwo) {
        this.fooTwo = fooTwo;
        System.out.println("프로퍼티 fooTwo 설정");
    }

    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("프로퍼티 bar 설정");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-04.xml");
        ctx.refresh();

        System.out.println("\nUsing byType:\n");
        CTarget t = (CTarget) ctx.getBean("targetByType");

        ctx.close();

    }
}
