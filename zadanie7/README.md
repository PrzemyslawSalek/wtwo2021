## Łańcuch zobowiązań

Załóżmy, że funkcja losuj(string) działa tak, że losowo przypisuje  wiadomości jedną z 3 kategorii : spam, ważne, inne. Powinien zostać wówczas stworzony obiekt klasy Napis zawierający łańcuch i jego kategorię.

Napisz program, który zbuduje łańcuch zależności (wzorzec łańcuch zobowiązań) oraz zdefiniuje napis (może być stałą). Program po przypisaniu napisowi kategorii (funkcją losuj()) przetworzy ten obiekt klasy Napis poprzez Łańcuch zobowiązań, a następnie wyświetli go na ekranie w funkcji main().

Obsługa polega na dodaniu do początku wiadomości tekstu :
- Gdy kategoria spam: „UWAGA! TO JEST SPAM”
- Gdy kategoria ważne: „UWAGA! WAŻNA WIADOMOŚĆ”
Ponadto, każda z nie-wylosowanych kategorii dodaje na koniec tekstu dodatkowe wiadomości (jak w przykładzie).

Implementacja wzorca ma korzystać z listy jednokierunkowej.

 
INPUT: „Ala ma kota.”, kategoria -> „spam”
OUTPUT: UWAGA! TO JEST SPAM. Ala ma kota. To nie jest ważna wiadomość. To nie jest wiadomość z kategorii inne.

INPUT: „Ala ma kota.”, kategoria -> „ważne”
OUTPUT: UWAGA! WAŻNA WIADOMOŚĆ. Ala ma kota. To nie jest spam. To nie jest wiadomość z kategorii inne.
 
INPUT: „Ala ma kota.”, kategoria -> „inne”
OUTPUT: Ala ma kota. To nie jest spam. To nie jest ważna wiadomość.