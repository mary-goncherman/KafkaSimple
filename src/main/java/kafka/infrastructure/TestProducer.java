package kafka.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String BAELDUNG_TOPIC_NAME = "baeldung";
    private static final String QUICK_TOPIC_NAME = "quickstart";

    public void sendMessage(String msg) {
        kafkaTemplate.send(BAELDUNG_TOPIC_NAME, "key", msg + " baeldung");
        kafkaTemplate.send(QUICK_TOPIC_NAME, "key", msg + " quickstart");
    }
}
