import java.util.ArrayList;

import Companies.*;

public class App {
    public static void main(String[] args) throws Exception {
        HoldingCompany euroCash = new HoldingCompany("EuroCash", "	Komorniki, Poland", "7791906082", 	(float) 5309000000.0, (float) 26000000.0, new ArrayList<String>());
        
        SmallCompany biedronka = new SmallCompany("Biedronka", "Kostrzyn, Poland", "8280808482", (float) 11000000.0, (float) 130000.0, new ArrayList<String>());
        BigCompany makro = new BigCompany("Makro", "Düsseldorf, Germany", "5220002860", (float) 32000000.0, (float) 50000.0, new ArrayList<String>());
        BigCompany selgros = new BigCompany("Selgros", "Neu Isenburg, Germany", "7811201692", (float) 3500000.0, (float) 20000.0, new ArrayList<String>());

        euroCash.add(biedronka);
        euroCash.add(makro);
        euroCash.add(selgros);

        euroCash.awardPrizes();
    }
}
