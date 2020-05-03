package pl.javastart.app.beans.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.javastart.app.beans.producers.Message;
import pl.javastart.app.beans.producers.MessageProducer;
import pl.javastart.app.beans.decorators.MessageDecorator;

@Component
public class MessagePrinter {
    @Autowired
    @Message(type = Message.MessageType.FILE)
    private MessageProducer producer;
    private MessageDecorator decorator;

    public MessagePrinter(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageDecorator getDecorator() {
        return decorator;
    }

    @Autowired(required = false)
    public void setDecorator(MessageDecorator decorator) {
        this.decorator = decorator;
    }

    public void print() {
        System.out.println("Message produced: " + producer.getMessage());
    }
}
