package seminars.fourth.weather;

import java.util.Random;

public class WeatherService {
    private Random random;

    public WeatherService() {
        this.random = new Random();
    }


    public int getCurrentTemperature() {
        return 22 + random.nextInt(9);
    }

}
