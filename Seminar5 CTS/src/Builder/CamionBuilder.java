package Builder;

public class CamionBuilder implements Builder{
    private String sasiu;
    private String producator;
    private int nrRoti;
    private String motor;
    private String interior;

    @Override
    public Builder addSasiu() {
        this.sasiu="RAR121";
        return this;
    }

    @Override
    public Builder addProducator() {
        this.producator="Ford";
        return this;
    }

    @Override
    public Builder addRoti() {
        this.nrRoti=4;
        return this;
    }

    @Override
    public Builder addMotor() {
        this.motor="Diesel";
        return this;
    }

    @Override
    public Builder addInterior() {
        this.interior="Piele alba";
        return this;
    }

    @Override
    public Automobil getAutomobil() {
        return new Automobil(sasiu,producator,nrRoti,motor,interior);
    }
}
