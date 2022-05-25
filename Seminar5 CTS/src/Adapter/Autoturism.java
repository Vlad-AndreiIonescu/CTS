package Adapter;

public class Autoturism implements IMasina{

    @Override
    public void ruleazaCuViteza() {
        System.out.println("Ruleaza cu 70km/h.");
    }

    @Override
    public void claxoneaza() {
        System.out.println("zzzz!");
    }
}
