import Podatki.*;
import Przedmioty.*;

public class App {
    public static void main(String[] args) throws Exception {
        Magazyn magazyn = new Magazyn();
        
        magazyn.dodajDoSpisu(new Ksiazka(1999, 2));
        magazyn.dodajDoSpisu(new Ksiazka(2007, 3));
        magazyn.dodajDoSpisu(new Obraz(1800));
        magazyn.dodajDoSpisu(new Obraz(1900));
        magazyn.dodajDoSpisu(new Rzezba(1500, 3));
        magazyn.dodajDoSpisu(new Rzezba(900, 5));

        System.out.println(magazyn.pobierzWatoscPoOpodatkowaniu(null));
        System.out.println(magazyn.pobierzWatoscPoOpodatkowaniu(new PodatekLiniowy()));
        System.out.println(magazyn.pobierzWatoscPoOpodatkowaniu(new PodatekProgresywny()));
    }
}
