package state;

public class InCursDePreparare implements iState{
    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("In curs de preparare!");
        comandaMancare.setState(new GataDeLivrare());
    }
}
