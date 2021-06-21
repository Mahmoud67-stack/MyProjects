package SoftwareDesign.LAB5.Question1;

public class DwightSchrute extends SalesRepresentative implements AssistantRegionalManager, FarmManager {
    DwightSchrute() {
        super();
    }

    DwightSchrute(String company, String email, int salary, int age) {
        super("DwightSchrute", company, email, salary, age);
    }

    public void meetingmanage(String manager) {
        System.out.println(name + " is having a meeting with " + manager + " “Assistant TO the Regional Manager” title.");
    }

    public void checksonharvest(String farmname) {
        System.out.println(name + " is going to his " + farmname + " farm to check on the harvest");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
