class Weather{
    
	static int numberofInstance=0;
    WeatherSeason season;
    float temperaturwinCelsius=29.0f;
    String humidity;
    boolean feel;

   Weather(WeatherSeason Season,String humidity){
	   numberofInstance++;
	   this.season=season;
	   this.humidity=humidity;
  }
}


































