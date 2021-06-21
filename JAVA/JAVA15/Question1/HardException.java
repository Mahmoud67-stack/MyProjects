package SoftwareDesign.MT1.Question1;

public class HardException extends Exception implements RedCard {
    private String reason1, penalty, massage;

    public HardException() {
        super();
    }

    public HardException(String reason1, String penalty) throws Exception {
        this.reason1 = reason1;
        this.penalty = penalty;
        massage = "This exception must be addressed because" + reason() + " and the penalty is ' " + penalty() + " '";
        throw new Exception(massage);
    }

    @Override
    public String reason() {
        return reason1;
    }

    @Override
    public String penalty() {
        return penalty;
    }

    @Override
    public String toString() {
        return massage;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
