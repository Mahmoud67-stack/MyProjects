package SoftwareDesign.MT1.Question1;


public class SoftException extends Exception implements GreenCard, YellowCard {

    private String reason1, reason2, conditiontobeissued, conditionnottobeissued, massage;

    public SoftException() {
    }

    public SoftException(String reason1, String reason2, String conditiontobeissued, String conditionnottobeissued) {
        this.reason1 = reason1;
        this.reason2 = reason2;
        this.conditionnottobeissued = conditionnottobeissued;
        this.conditiontobeissued = conditiontobeissued;

        massage = "This exception can potentially be ignored and it applies " + conditionscanbeissued() + " and does not apply when " + conditionsconnotbeissued() +
                "\nand it is also green because " + reason();
    }

    @Override
    public String reason() {
        return reason1;
    }

    @Override
    public String reasons() {
        return reason2;
    }

    @Override
    public String conditionscanbeissued() {
        return conditiontobeissued;
    }

    @Override
    public String conditionsconnotbeissued() {
        return conditionnottobeissued;
    }


    @Override
    public String toString() {
        return massage;
    }
}
