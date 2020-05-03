package pl.javastart.beans;

public class MessagePrinter {
    private MessageProducer producer;

    public MessagePrinter() {
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print(){
        System.out.println(producer.getMessage());
    }
}
