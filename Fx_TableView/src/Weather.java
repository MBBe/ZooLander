import classes.IWeatherDataService;
import classes.Location;
import classes.WeatherData;
import classes.WeatherDataServiceFactory;
import exceptions.WeatherDataServiceException;

public class Weather {

    // This connects to the internet and gets the data
    IWeatherDataService dataService = WeatherDataServiceFactory.getWeatherDataService(WeatherDataServiceFactory.service.OPEN_WEATHER_MAP);

    // This is where the weather data is stored
    WeatherData data;

    public Weather() {
        //Setup stuff to will allow us to get the weather

        try
        {
            // This downloads the weather and puts it in our "data" object
            data = dataService.getWeatherData(new Location("London", "UK"));
        }
        catch (WeatherDataServiceException e)
        {
            e.printStackTrace();
        }
    }

    public String getTemperature(){
        return data.getTemperature().toString();
    }

    public String getDescription(){
        return data.getWeather().toString();
    }

    public String getCity(){
        return data.getCity().toString();
    }

}
