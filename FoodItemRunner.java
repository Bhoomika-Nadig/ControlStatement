class FoodItemRunner {
public static void main(String[] args){
FoodItem fooditem1=new FoodItem("palav",100,"udapiupahar",1,Type.GOOD,4,OrderType.ONLINE);
fooditem1.displayDetails();
fooditem1.printTotalPrice();

FoodItem fooditem2=new FoodItem("Chocolate",100,"bakery",2,Type.BETTER,8,OrderType.OFFLINE);
fooditem2.displayDetails();
fooditem2.printTotalPrice();

FoodItem.printTotalFoodItemsPrice();
}

}
