package Proizvodi;

public class Proizvod {
    private String naziv;
    private double cijena;
    private int kolicina;

    public Proizvod(String naziv, double cijena, int kolicina) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return "Proizvod: " +
                "naziv: " + naziv +
                ", cijena: " + cijena +
                ", kolicina: " + kolicina;
    }
}
