package state;

public class InDrumSpreClient implements  iState{
    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("In drum spre client");
        comandaMancare.setState(new Livrat());
    }
}
