class MusicRunner{
         
		 public static void main (String [] args){
          
		  MusicInstruments instruments=MusicInstruments.KEYBOARD;
		  String musicname="melody";
		  Music music = new Music(musicname,instruments);
          music.volume=50.0f;
          music.turnedon=true;
		  
 
         System.out.println(music.volume);
		 System.out.println(music.musicname);
		 System.out.println(music.turnedon);
		 System.out.println(music.instruments);
		 
		 
		 }
}
