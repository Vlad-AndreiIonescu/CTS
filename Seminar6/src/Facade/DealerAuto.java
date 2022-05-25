package Facade;

public class DealerAuto {
    MasinaClasica masinaClasica;
    MasinaElectrica masinaElectrica;
    MasinaHybrid masinaHybrid;

    public DealerAuto() {
    }

    public void getDetailsMC(){
        masinaClasica.getDetails();
    }

    public void getDetailsME(){
        masinaElectrica.getDetails();
    }

    public void getDetailsMH(){
        masinaHybrid.getDetails();
    }
}
