package pl.edu.wszib.springhelloworld.model;

public class Samochod {

    private Karoseria karoseria;
    private Zawieszenie zawieszenie;

    public Samochod(Karoseria karoseria, Zawieszenie zawieszenie) {
        this.karoseria = karoseria;
        this.zawieszenie = zawieszenie;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "karoseria=" + karoseria +
                ", zawieszenie=" + zawieszenie +
                '}';
    }
}
