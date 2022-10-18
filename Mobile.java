class Mobile extends Telephone
{
int price = 10000; 
    String name = "Mobile"; 

 public void sms()
    {
    System.out.println("Messaging Facility"); 
    }

public static void main (String[] args)
{
Mobile samsung = new Mobile(); 
 Telephone bsnl = new Telephone(); 
samsung.call();
samsung.receive_call();
samsung.sms();
   System.out.println(samsung.price); 
    System.out.println(samsung.name); 
 System.out.println(bsnl.price); 
    System.out.println(bsnl.name); 
bsnl.call();
bsnl.receive_call();


}
}
