package SoftwareDesign.LAB12;

public class Message {
    Object origin;
    String topic;
    String payload;

    Message(Object origin, String topic, String payload){
        this.origin=origin;
        this.topic=topic;
        this.payload=payload;
    }

    public String toString() {
        return origin+ topic + payload;
    }
}
