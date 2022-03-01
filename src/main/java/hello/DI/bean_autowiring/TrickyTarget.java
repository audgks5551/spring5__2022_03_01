package hello.DI.bean_autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrickyTarget {

    Foo fooOne;
    Foo fooTwo;
    Bar bar;

    public TrickyTarget() {
        System.out.println("Target.constructor()");
    }

    public TrickyTarget(Foo fooOne) {
        System.out.println("Target(Foo) 호출");
    }

    public TrickyTarget(Foo fooOne, Foo fooTwo) {
        System.out.println("Target(Foo, Bar) 호출");
    }

    @Autowired
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

        TrickyTarget t = ctx.getBean(TrickyTarget.class);

        ctx.close();
    }
}
