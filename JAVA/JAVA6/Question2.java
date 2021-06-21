package SoftwareDesign.LAB3;

class CaptainAmerica implements Avengers {
    @Override
    public void gotpowers() {
        System.out.println("Captain America was injected with a super soldier serum");
    }
}

class Spiderman implements Avengers {
    @Override
    public void gotpowers() {
        System.out.println("Spiderman was bitten by a radioactive spider on a school fieldtrip");
    }
}

class Hulk implements Avengers {
    @Override
    public void gotpowers() {
        System.out.println("The Hulk was subjected to Gamma radiation");
    }
}


public class Question2 {
    public static void main(String[] args) {
        CaptainAmerica captainAmerica = new CaptainAmerica();
        Spiderman spiderman = new Spiderman();
        Hulk hulk = new Hulk();

        captainAmerica.gotpowers();
        spiderman.gotpowers();
        hulk.gotpowers();

    }
}
