## Budowniczy

Napisz program, który dla tablicy o rozmiarze 10 z wartościami typu int, wyświetli na ekran w zależności od wyboru (wav, mp3, ogg) „wygenerowany” napis. W zależności od formatu będzie miał on inną postać.

Scenariusz budowania napisu wygląda następująco:

- **budujNaglowek()**
- **budujTagi()**
- **budujBody(int[] tablica)**

Dla poszczególnych formatów poszczególne napisy to:

- wav:
```
nagłówek - napis „WavHeader”
tagi -nic - czyli pusty napis ””
body - dane z tablicy wejściowej przekonwertowane na napis, oddzielone przecinkami.
```
- mp3:
```
nagłówek - „Mp3Header”
tagi - „Mp3Tags”
body - dane z tablicy wejściowej spakowane zipem i zakodowane base64, przekonwertowane na napis.
```
- ogg:
```
nagłówek - „OggHeader”
tagi - „OggTags”
body - dane z tablicy wejściowej z „przyciętymi” wartościami, tak, że jeżeli tab[x] > 100 to tab[x] = 100 i tab[x] < -100 to tab[x] = -100, spakowane zipem i zakodowane base64  przekonwertowane na napis.
```

Kierownik w konstruktorze otrzymuje wybranego przez użytkownika budowniczego i posiada metodę **wygenerujNapis(z parametrem tablicy wejściowej)**. Metoda ta zwraca zbudowany napis, który ma być wyświetlony na ekran w funkcji main. Tablica wejściowa ma być zadeklarowana w funkcji main. W funkcji main  wygeneruj trzy napisy - dla każdego budowniczego po jednym.
