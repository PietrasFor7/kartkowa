public class Autobus extends Pojazd{
    int liczbaosob;
    public Autobus(int liczbaosob,int liczbakol){
        super(liczbakol);
        this.liczbaosob=liczbaosob;
    }

    public int getLiczbaosob(int liczbaosob){

        return liczbaosob;
    }

    public void setLiczbaosob(int liczbaosob) {
        this.liczbaosob = liczbaosob;
    }
}
