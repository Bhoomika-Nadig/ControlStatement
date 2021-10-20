class Music{
        String musicname;
        MusicInstruments instruments;
        boolean turnedon;
        static int durationofinstruments =5;
        float volume=50.0f;

   Music(String musicname,MusicInstruments instruments)
  {
	   durationofinstruments++;
	    this.instruments=instruments;
        this.musicname=musicname;
        
}
}