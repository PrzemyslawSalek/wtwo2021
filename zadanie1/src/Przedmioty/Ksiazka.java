package Przedmioty;

public class Ksiazka implements Przedmiot {
    int rokWydania;
    int numerWydania;

    public Ksiazka(int rokWydania, int numerWydania) {
        this.rokWydania = rokWydania;
        this.numerWydania = numerWydania;
    }

    @Override
    public float okreslWartosc() {
        return (float) (2050 - rokWydania) / numerWydania;
    }
    
}
