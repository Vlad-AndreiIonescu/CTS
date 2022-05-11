package state;

public class Livrat implements iState {

    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Comanda livrata:");
    }
}
