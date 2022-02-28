package hello.DI;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
    // MessageProvider에게 메시지를 가져오는 책임을 위임 ( MessageProvider는 MessageRenderer와 의존성이 있다.)
}
