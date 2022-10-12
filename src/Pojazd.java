public abstract class Pojazd {
    int liczbakol;

    public Pojazd(int liczbakol){
        this.liczbakol=liczbakol;



    }
    public Pojazd(){
        this.liczbakol=0;
    }



    public int getLiczbakol() {
        return liczbakol;
    }

    public void setLiczbakol(int liczbakol) {
        this.liczbakol = liczbakol;
    }

}
