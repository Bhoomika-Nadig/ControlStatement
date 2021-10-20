class BankEmployeeStarter{
 public static void main(String[] args){
BankEmployee bank=new BankEmployee("canara bank",50000f,25,"shivmogga");
System.out.println(bank.name);
System.out.println(bank.salary);
System.out.println(bank.id);
System.out.println(bank.location);
Branch branch=new Branch("vinob nagar branch",2);
System.out.println(branch.name);
System.out.println(branch.noofBranch);

}
}