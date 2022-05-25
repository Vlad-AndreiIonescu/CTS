import java.util.HashMap;

public class MasinaFactory {
    private static HashMap<TipMasina, Masina> masiniDeAfisat = new HashMap<TipMasina, Masina>();

    public static Masina getMasina(TipMasina tipMasinaDeAfisat)
    {
        if(masiniDeAfisat.containsKey(tipMasinaDeAfisat))
            return masiniDeAfisat.get(tipMasinaDeAfisat);
        else {
            Masina masina = null;
            switch (tipMasinaDeAfisat)
            {
                case CAMION_GALBEN: {
                    masina = new Camion("roti mari", "cabina rabatabila",
                            "Scania", "GALBEN", "Incarcat cu piatra");
                    break;
                }
                case CAMION_ROSU:{
                    masina = new Camion("roti mari", "cabina rabatabila",
                            "Scania", "ROSU", "Incarcat cu piatra");
                    break;
                }
                case AUTOTURISM_ROSU : {
                    masina = new Autoturism("roti mici", "geamuri fumuriii",
                            "Volkswagen", "VERDE", "Suport dublu");
                    break;
                }
                case AUTOTURISM_GALBEN : {
                    masina = new Autoturism("roti mici", "geamuri fumurii",
                            "Volkswagen", "GALBEN", "Suport dublu");
                    break;
                }
                default :{break;}
            }
            if(masina != null)
                masiniDeAfisat.put(tipMasinaDeAfisat, masina);
            return masina;
        }
    }
}