## Kompozyt, Dekorator, Wizytator
**Część 1**

Bonifikata za konto.

Skonstruuj kompozyt Firm holdingu, w których zawierać się będą dane firmy (nazwa, adres, NIP), przychody roczne z ostatnich 10 lat, dochody z ostatnich 10 lat, nazwy kontrahentów z ostatnich 10 lat.

Mamy kompozyt Firm z NIPami. Za odpowiedni NIP dostajemy nagrody:
- jeżeli wszystkie cyfry są nieparzyste - 50zł
- jeżeli co najmniej połowa cyfr jest podzielna przez 3 - 100zł
- jeżeli NIP zawiera cyfry MMDD tego dnia (np. 1104) - 15zł
- jeżeli suma cyfr wynosi sumie dnia i miesiąca, pomnożonej razy 3 - 550zł
- jeżeli suma wartości bezwzględnych różnic między kolejnymi cyframi jest większa niż 50 - 200zł
- jeżeli Firma jest wyróżniona laurem Złota Firma - 30zł

**Część 2**

Bonifikatą jest suma nagród. Należy pozwolić na określenie dla każdej z Firm holdingu jej bonifikaty. Dla Firm o przychodach większych od 100tys. pozwól określić status klienta jako wyróżniony laurem Złota Firma. Użyj wzorca Dekorator.

**Część 3**

Wyświetl sumę nagród dla każdej z Firm używając dekoratora złożonego ze wszystkich możliwych klas dekorujących.
Używając wzorca Wizytator, stwórz klasy, które przekonwertują obiekty klasy Firma na dwa formaty: json i xml.