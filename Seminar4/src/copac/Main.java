package copac;

public class Main {
    public static void main(String[] args) {
        Copac copac = new Copac(1, "verde", "mare", 2, 5);
        try {
            Copac clone = copac.clone();
            clone.setPozitieXOY(10,10);
            System.out.println(copac);
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
