package hello.DI.bean_instantiation_mode;

public class Singleton {

    private static Singleton instance; // 단 하나만 생성

    static {
        instance = new Singleton();
    }

    // 인스턴스 반환
    public static Singleton getInstance() {
        return instance;
    }
}
