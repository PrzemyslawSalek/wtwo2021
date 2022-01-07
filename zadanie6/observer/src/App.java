public class App {
    public static void main(String[] args) throws Exception {
        Temperature temperature = new Temperature();
        Wind wind = new Wind();

        TemperatureAverage temperatureAverage = new TemperatureAverage(temperature);
        WindChill windChill = new WindChill(temperature, wind);

        temperature.attach(temperatureAverage);
        wind.attach(temperatureAverage);
        wind.attach(windChill);

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
