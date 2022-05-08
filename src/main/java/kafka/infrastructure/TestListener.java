package kafka.infrastructure;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TestListener {

    @KafkaListener(topics = "baeldung", groupId = "bdg")
    public void listenGroupBaeldung(String message) {
        System.out.println("Received Message in group baeldung: " + message);
    }

    @KafkaListener(topics = "quickstart", groupId = "qst")
    public void listenGroupQuickstart(String message) {
        System.out.println("Received Message in group quickstart: " + message);
    }

    @KafkaListener(topics = {"baeldung", "quickstart"}, groupId = "total")
    public void listenGroupTotal(String message) {
        System.out.println("Received Message in group total: " + message);
    }
}
