## Komenda

Zdefiniuj trzy klasy, z których każda wykonuje tylko jedną czynność odpowiednio:

- zapisuje do pliku linię liter "savetofile",

- zapisuje do pliku zapis liczbowy 10000,

- zlicza wszystkie zapisy liczbowe dotychczas zapisane w pliku, sumuje je i zapisuje linię "sum:X", gdzie X, to wyliczona suma liczb.

Przed zapisem do pliku komenda otwiera plik, a potem go zamyka. Ponadto każda z klas ma pole godzina (int godzina, int minuta).

Bazując na wzorcu komenda/polecenie, utwórz sześć komend (dwie literowe, dwie liczbowe, dwie sumaryczne), które wstawimy na listę/kolejkę komend. Każda ma być ‘uzbrojona’ w ścieżkę do pliku i godzinę odpalenia (możemy ustawić dowolną, poprawną wartość czasu). Następnie w funkcji main (która będzie naszym Invokerem), należy cyklicznie przeglądać kolejkę i jeżeli komenda będzie miała czas równy bieżącej godzinie systemowej wtedy należy ją odpalić. Na początku bieżącą godzinę systemową ustawiamy na wartość 00:00 i po każdym cyklu zwiększamy o jedną minutę, aż do osiągniecia godziny 23:59.