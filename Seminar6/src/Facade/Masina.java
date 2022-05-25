package Facade;

public class Masina {
    protected String producator;
    protected String sasiu;
    protected String culoare;

    public Masina(String producator, String sasiu, String culoare) {
        this.producator = producator;
        this.sasiu = sasiu;
        this.culoare = culoare;
    }

    public void getDetails(){
        System.out.println("Producatorul este:"+producator+" Sasiul este: " + sasiu +" Culoarea este: " +culoare);
    }
}
