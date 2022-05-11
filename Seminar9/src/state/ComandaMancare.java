package state;

public class ComandaMancare {
    private int nrComanda;
    private iState state;

    public ComandaMancare(int nrComanda, iState state) {
        this.nrComanda = nrComanda;

    }
    public ComandaMancare(){

    }


    public void setState(iState state) {
        this.state = state;
    }

    public void nextState(){

        state.updateState(this);

    }
}
