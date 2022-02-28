package hello.DI.beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); // BeanFactory 구현체
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory); // xml 파일 읽어서 빈 등록
        rdr.loadBeanDefinitions(new
                ClassPathResource("xml-bean-factory-config.xml"));
        Oracle oracle = (Oracle) factory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }
}
