# Mediator

Korzystając ze wzorca Mediator zaimplementuj klasę KwateraGlowna, która będzie przekazywała doniesienia z wojny do odpowiednich jednostek. Tymi jednostkami będzie PierwszaArmia, DrugaArmia, CentrumDowodzenia i Wywiad. Przekazują one względem siebie Doniesienia i Rozkazy. PierwszaArmia i DrugaArmia mogą dokonać ataku. CentrumDowodzenia podejmuje decyzje, a Wywiad zbiera materiały.

Napisz program, który umożliwi przekazanie:
- Doniesienie z Wywiadu do Pierwszej Armii: Wróg planuje ruch na wschód.
- Doniesienie z Pierwszej Armii do Drugiej Armii: Atakujemy lewą flankę.
- Rozkaz z Centrum Dowodzenia do Drugiej Armii: Atakuj tyły wroga.
- Rozkaz z Centrum Dowodzenia do Pierwszej Armii: Przewidywany deszcz. Zwiąż siły wroga w okolicach bagien.
Każde doniesienie powinno również zostać przekazane do Centrum Dowodzenia.
