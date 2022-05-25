package Composite;

public class Main {
    public static void main(String[] args) {
        Angajat angajat1 = new Angajat("Vlad Ionescu", "100");
        Angajat angajat2 = new Angajat("Eduard Iancu", "101");
        Angajat angajat3 = new Angajat("Leonard Ionescu", "102");
        angajat1.afiseazaDetalii();
        angajat2.afiseazaDetalii();


        Angajat m1 = new Angajat("Tiberiu Dumitru", "104");
        m1.adaugareSubordonat(angajat3);
        m1.adaugareSubordonat(angajat2);
        m1.afiseazaDetalii();
    }
}
