package kafka;

import kafka.infrastructure.TestProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "kafka")
public class MainApp {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {

        applicationContext = SpringApplication.run(MainApp.class, args);
        TestProducer testProducer = (TestProducer) applicationContext.getBean("testProducer");
        testProducer.sendMessage("Hello");
    }
}
