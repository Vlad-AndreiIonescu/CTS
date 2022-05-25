package Adapter;

public class MasinaJucarie implements JucarieMobila{
    @Override
    public void seDeplaseaza() {
        System.out.println("Se deplaseaza cu 0,5km/h");
    }

    @Override
    public void emiteSunete() {
        System.out.println("Muzica");
    }
}
