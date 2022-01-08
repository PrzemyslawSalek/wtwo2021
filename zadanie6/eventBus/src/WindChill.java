public class WindChill implements Observer {

    private final Temperature temperature;
    private final Wind wind;
    private int lastTemperature;
    private int lastWindSpeed;
    private int perceptibleTemperature;

    public WindChill(Temperature temperature, Wind wind) {
        this.temperature = temperature;
        this.wind = wind;
        this.lastTemperature = 0;
        this.lastWindSpeed = 0;
        this.perceptibleTemperature = 0;
    }

    @Override
    public void update() {
        lastTemperature = temperature.getCurrentTemperature();
        lastWindSpeed = wind.getCurrentWindSpeed();
        perceptibleTemperature = lastTemperature - (lastWindSpeed/100)*5;

        System.out.println("Perceptible temperature: " + perceptibleTemperature);
    }
}
