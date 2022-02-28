package hello.DI.spring;

import hello.DI.impl.HelloWorldMessageProvider;
import hello.DI.MessageProvider;
import hello.DI.MessageRenderer;
import hello.DI.impl.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer () {
        MessageRenderer renderer = new StandardOutMessageRenderer(provider());
//        renderer.setMessageProvider(provider());
        return renderer;
    }
}
