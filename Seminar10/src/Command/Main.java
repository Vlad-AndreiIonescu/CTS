package Command;

public class Main {
    public static void main(String[] args) {
        ServerOperatiuneBancara server = ServerOperatiuneBancara.getInstance();

        iOperatiuneBancara alimentareCont = new AlimentareCont("5341BCR1090871",200);
        iOperatiuneBancara transferBancar = new TransferBancar("5342BRD1111111",2790, "4211BCR1554998");

        server.inregistreazaOperatiune(alimentareCont);
        server.inregistreazaOperatiune(transferBancar);
        server.prelucrareOperatiuni();
        server.prelucrareOperatiuni();
    }
}
