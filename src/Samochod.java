public  class Samochod extends Pojazd{
    String kolor;
    String marka;
    String model;

    static int zliczanie = 0;


    public Samochod(int liczbakol, String kolor, String model, String marka) {
        super(liczbakol);
        this.marka = marka;
        this.kolor = kolor;
        this.model = model;

    }



    public String getKolor() {
        return kolor;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "kolor='" + kolor + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
