class WeatherRunner{
public static void main(String[] args)
{
WeatherSeason season=WeatherSeason.SUMMER;
String humidity="cloudy";
Weather weather=new Weather(season,humidity);
weather.feel=true;
System.out.println(weather.season);
System.out.println(weather.temperaturwinCelsius);
System.out.println(weather.humidity);
System.out.println(weather.feel);


System.out.println(weather.numberofInstance);
}
}


