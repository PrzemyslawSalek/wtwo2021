package Budowniczy;

import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.zip.Deflater;

import Formaty.Ogg;

public class BudowniczyOgg extends BudowniczyFormatu {
    public BudowniczyOgg() {
        format = new Ogg();
    }

    @Override
    public void budujNaglowek() {
        format.setNaglowek("OggHeader");
    }

    @Override
    public void budujTagi() {
        format.setTagi("OggTags");
    }

    @Override
    public void budujBody(int[] liczby) {
        try {
            byte[] bytes = new byte[liczby.length];
            for (int i = 0; i < liczby.length; i++) {
                if (liczby[i] > 100) {
                    liczby[i] = 100;
                } else if (liczby[i] < -100) {
                    liczby[i] = -100;
                }
                bytes[i] = (byte)liczby[i];
            }

            ByteArrayOutputStream baos = null;
            Deflater dfl = new Deflater();
            dfl.setLevel(Deflater.BEST_COMPRESSION);
            dfl.setInput(bytes);
            dfl.finish();
            baos = new ByteArrayOutputStream();
            byte[] tmp = new byte[4*1024];
            try{
                while(!dfl.finished()){
                    int size = dfl.deflate(tmp);
                    baos.write(tmp, 0, size);
                }
            } catch (Exception ex){
                 
            } finally {
                try{
                    if(baos != null) baos.close();
                } catch(Exception ex){}
            }
             
            byte[] zipped = baos.toByteArray();

            format.setBody(Base64.getEncoder().encodeToString(zipped));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
