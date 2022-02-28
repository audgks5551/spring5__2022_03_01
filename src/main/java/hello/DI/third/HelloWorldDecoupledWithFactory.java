package hello.DI.third;

import hello.DI.MessageProvider;
import hello.DI.MessageRenderer;
import hello.DI.second.MessageSupportFactory;

public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRenderer mr =
                MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp =
                MessageSupportFactory.getInstance().getMessageProvider();

        mr.setMessageProvider(mp);
        mr.render();
    }
}
