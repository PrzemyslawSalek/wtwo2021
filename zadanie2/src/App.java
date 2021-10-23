import Budowniczy.*;

public class App {
    public static void main(String[] args) throws Exception {
        int liczby[] = {101, -111, 22, 33, 664, 65, 66, 67, 58, 9};
        Kierownik kierownikWav = new Kierownik(new BudowniczyWav());
        Kierownik kierownikMp3 = new Kierownik(new BudowniczyMp3());
        Kierownik kierownikOgg = new Kierownik(new BudowniczyOgg());

        kierownikWav.wygenerujNapis(liczby).opis();
        System.out.println("");
        kierownikMp3.wygenerujNapis(liczby).opis();
        System.out.println("");
        kierownikOgg.wygenerujNapis(liczby).opis();
    }
}
