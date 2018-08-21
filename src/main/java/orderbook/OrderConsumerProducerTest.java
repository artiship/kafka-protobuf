package orderbook;

public class OrderConsumerProducerTest {

    private static String topic = "zz";

    public static void main(String[] args) {
        OrderProducer producerThread = new OrderProducer(topic);
        producerThread.start();

        OrderConsummer consumerThread = new OrderConsummer(topic);
        consumerThread.start();
    }
}