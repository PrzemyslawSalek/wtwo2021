public class App {
    public static void main(String[] args) throws Exception {
        EventBroker eventBroker = new EventBroker();

        Temperature temperature = new Temperature(eventBroker);
        Wind wind = new Wind(eventBroker);

        TemperatureAverage temperatureAverage = new TemperatureAverage(temperature);
        WindChill windChill = new WindChill(temperature, wind);

        eventBroker.addPublisher(temperature);
        eventBroker.addPublisher(wind);

        eventBroker.addSubscriber(temperature, temperatureAverage);
        eventBroker.addSubscriber(temperature, windChill);
        eventBroker.addSubscriber(wind, windChill);

        System.out.println("Start!");
        Thread observableThread = new Thread(() -> {
            while(true) {
                try {
                    temperature.publishTemperatureChange();
                    wind.publishWindChange();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        observableThread.start();
    }
}
