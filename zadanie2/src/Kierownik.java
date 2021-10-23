import Budowniczy.BudowniczyFormatu;
import Formaty.Format;

public class Kierownik {
    private BudowniczyFormatu wybranyBudowniczy;

    public Kierownik(BudowniczyFormatu budowniczy) {
        wybranyBudowniczy = budowniczy;
    }
    
    public Format wygenerujNapis(int[] liczby) {
        wybranyBudowniczy.budujNaglowek();
        wybranyBudowniczy.budujTagi();
        wybranyBudowniczy.budujBody(liczby);

        return wybranyBudowniczy.getFormat();
    }
}
