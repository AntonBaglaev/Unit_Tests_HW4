package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {

    @Test
    public void testWeatherReporter() {
        WeatherService mockWeatherServices = mock(WeatherService.class);
        when(mockWeatherServices.getCurrentTemperature()).thenReturn(30);
        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherServices);
        String report = weatherReporter.generateReport();
        assertEquals("Текущая температура: 30 градусов", report);
    }

}