class MovieTicket{
 String name;
 int price;
 int noofSeats;
 static float totalMovieTiceketPrice;
 
 MovieTicket(String name,int price,int noofSeats)
 {
 this.name=name;
 this.price=price;
 this.noofSeats=noofSeats;
 System.out.println("invoked parameter constructor");
 }
 void displayDetails()
 {
 System.out.println(name);
 System.out.println(price);
 System.out.println(noofSeats);
 }
 void printTotalPrice()
 {
 float total=this.price*this.noofSeats;
 System.out.println("totalprice"+total);
 totalMovieTiceketPrice=totalMovieTiceketPrice+total;
 }
 static void printtotalMovieTicketPrice()
 {
 System.out.println("totalMovieTiceketPrice:"+totalMovieTiceketPrice);
 }
 }