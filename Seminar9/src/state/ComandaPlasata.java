package state;

public class ComandaPlasata implements  iState{
    @Override
    public void updateState(ComandaMancare comandaMancare) {

        System.out.println("Comanda a fost plasata!");
        comandaMancare.setState(new InCursDePreparare());
    }


}
