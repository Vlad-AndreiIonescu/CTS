package Adapter;

public class AdapterMasina implements JucarieMobila{

    Masina masina;

    public AdapterMasina(Masina masina) {
       this.masina= masina;
    }

    @Override
    public void seDeplaseaza() {
        masina.ruleazaCuViteza();
    }

    @Override
    public void emiteSunete() {
        masina.claxoneaza();
    }
}
