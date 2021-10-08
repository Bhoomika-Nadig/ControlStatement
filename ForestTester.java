class ForestTester{
public static void main(String[] traveler){
Forest forest;
forest=new Forest("india","usa","USA");
System.out.println(forest.name);
System.out.println(forest.location);
System.out.println(forest.state);

State state=new State(28,"bhoomi","banglore");
System.out.println(state.name);
System.out.println(state.noofDistricts);
System.out.println(state.CapitalCity);

CapitalCity capita=new CapitalCity("banglore",9448232994,"it company");
System.out.println(capita.name);
System.out.println(capita.noofDistricts);
System.out.println(capita.CapitalCity);
}
}