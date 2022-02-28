package hello.DI.second;

import hello.DI.impl.HelloWorldMessageProvider;
import hello.DI.MessageProvider;
import hello.DI.MessageRenderer;
import hello.DI.impl.StandardOutMessageRenderer;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageProvider mp = new HelloWorldMessageProvider();
        MessageRenderer mr = new StandardOutMessageRenderer(mp);

//        mr.setMessageProvider(mp);
        mr.render();

    }
}
