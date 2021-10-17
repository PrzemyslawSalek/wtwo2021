## Strategia, Fabryka, Adapter
**Część 1**

Napisz klasę **Magazyn**, który będzie zawierała metodę *dodajDoSpisu()*, a która będzie przyjmować w parametrze pojedynczy przedmiot. Magazyn powinien również zawierać metodę *pobierzWartośćPoOpodatkowaniu()* przyjmującą w parametrze **Podatek** i zwracającą sumaryczną wartość całego Magazynu po odjęciu podatku. Napisz klasy, które będą opisywać magazynowane **Przedmioty: Książki, Obrazy i Rzeźby**.

Każdy z tych Przedmiotów powinien móc być wyceniony poprzez metodę *określWartość()*.

- wartość Książek to 2050 minus rok wydania, podzielone przez numer wydania książki.
- wartość Obrazów to 2100 minus rok namalowania, pomnożone razy 10.
- wartość Rzeźb to 2020 minus rok wykonania, pomnożone przez rozmiar rzeźby w metrach sześciennych, pomnożone razy 2.

Napisz przy użyciu wzorca Strategia klasy Podatku: **PodatekLiniowy** i **PodatekProgresywny**.

- PodatekLiniowy będzie wynosił 19% od obliczonej kwoty,
- PodatekProgresywny 18% od kwoty do 10 tys. włącznie, i 32% od kwoty powyżej 10 tys..

Napisz program, który doda do Magazynu po jednym przedmiocie każdego typu i wyświetli wartość Magazynu dla dwóch różnych podatków. Dane przedmiotów są dowolne.
```
książka	rok	1999	wydanie	2	25,5
książka	rok	2006	wydanie	3	14,66667
obraz	rok	1800	 	 	    3000
obraz	rok	1900	 	 	    2000
rzezba	rok	1500	m3	    3	3120
rzezba	rok	900	    m3	    5	11200
 	 	bez podatku	            19360,17
 	 	z podatkiem liniowym	15681,74
 	 	z podatiem progresywnym	14564,91
```

**Część 2**

Przy użyciu wzorca Fabryka (abstrakcyjna) stwórz klasy tworzące Strategie dla różnych krajów: USA (10% liniowy i tyle samo progresywny), Polska (jak w cz. 1), Francja (30% i 50% od 40 tys. euro), Niemcy (20% i 40% od 50 tys. euro).

**Część 3**

Przy użyciu Adaptera zmodyfikuj program tak, aby można było porównać wielkości obliczonego podatku między strategiami w euro. Załóż kurs dolara 3,8 USD za 3 EUR i 4,2 PLN za 1 EUR.