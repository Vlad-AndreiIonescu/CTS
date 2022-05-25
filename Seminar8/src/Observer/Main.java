package Observer;

public class Main {
    public static void main(String[] args) {
        UpdateServer updateServer = new UpdateServer("iOS13");
        CarOS carOS1 = new CarOS("ios12");
        CarOS carOS2 = new CarOS("ios11");
        updateServer.addObserver(carOS1);
        updateServer.addObserver(carOS2);
        carOS1.afiseaza();
        carOS2.afiseaza();
        updateServer.pushUpdates("iOS13");
        carOS1.afiseaza();
        carOS2.afiseaza();
    }
}
