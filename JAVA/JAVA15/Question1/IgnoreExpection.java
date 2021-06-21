package SoftwareDesign.MT1.Question1;


public class IgnoreExpection extends Exception implements GreenCard {

    private String reason1, massage;

    public IgnoreExpection() {
    }

    public IgnoreExpection(String reason1) {
        this.reason1 = reason1;
        massage = "This exception must be ignored and it is green because " + reason();
    }

    @Override
    public String reason() {
        return reason1;
    }

    @Override
    public String toString() {
        return massage;
    }
}
