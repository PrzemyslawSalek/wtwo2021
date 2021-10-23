package Budowniczy;

import java.util.Arrays;

import Formaty.Wav;

public class BudowniczyWav extends BudowniczyFormatu {
    public BudowniczyWav() {
        format = new Wav();
    }

    @Override
    public void budujNaglowek() {
        format.setNaglowek("WavHeader");
    }

    @Override
    public void budujTagi() {
        format.setTagi("");
    }

    @Override
    public void budujBody(int[] liczby) {
        format.setBody(Arrays.toString(liczby));
    }
    
}
