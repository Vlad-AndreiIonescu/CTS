package state;

public class GataDeLivrare implements iState{
    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Gata de livrare!");
        comandaMancare.setState(new InDrumSpreClient());
    }
}
