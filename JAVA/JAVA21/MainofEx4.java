public class MainofEx4 {
    public static void main(String args[]) throws InterruptedException
    {
        TeaKettle monitor = new TeaKettle();
        TeaParty Alice = new TeaParty("Alice",monitor);
        TeaParty MadHatter = new TeaParty("MadHatter",monitor);
    } 
}