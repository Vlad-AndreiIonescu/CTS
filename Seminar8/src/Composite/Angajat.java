package Composite;

import java.util.ArrayList;
import java.util.List;

public class Angajat implements IAngajat{
    String nume;
    String codAngajat;
    private List<IAngajat> listaAngajati= new ArrayList<>();

    public Angajat(String nume, String codAngajat) {
        this.nume = nume;
        this.codAngajat = codAngajat;
    }

    public void adaugareSubordonat(IAngajat iAngajat){
        listaAngajati.add(iAngajat);
    }

    public void stergereSubordonat(IAngajat iAngajat){
        listaAngajati.remove(iAngajat);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Angajatul " + nume +" cu codul " +codAngajat);
        if(!listaAngajati.isEmpty()){
            System.out.println(" are in subordine: ");
            for(IAngajat ia:listaAngajati){
                ia.afiseazaDetalii();
            }
        }
        else{
            System.out.println("Nu are subordonati");
        }

    }
}
