public class App {
    public static void main(String[] args) throws Exception {
        Colleague firstArmy = new Colleague("firstArmy", "Pierwszej Armii");
        Colleague secondArmy = new Colleague("secondArmy", "Drugiej Armii");
        Colleague commandCenter = new Colleague("commandCenter", "Centrum Dowodzenia");
        Colleague militaryIntelligence = new Colleague("militaryIntelligence", "Wywiadu");

        Mediator headquarters = new Headquarters();

        ((Headquarters) headquarters).addColleague(firstArmy);
        ((Headquarters) headquarters).addColleague(secondArmy);
        ((Headquarters) headquarters).addColleague(commandCenter);
        ((Headquarters) headquarters).addColleague(militaryIntelligence);

        militaryIntelligence.sendMessage("firstArmy", "Wróg planuje ruch na wschód.", "Doniesienie");
        firstArmy.sendMessage("secondArmy", "Atakujemy lewą flankę.", "Doniesienie");
        commandCenter.sendMessage("secondArmy", "Atakuj tyły wroga.", "Rozkaz");
        commandCenter.sendMessage("firstArmy", "Przewidywany deszcz. Zwiąż siły wroga w okolicach bagien.", "Rozkaz");
    }
}
