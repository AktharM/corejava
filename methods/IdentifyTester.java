class IdentifyTester
{
    public static void main(String a[])
	{
		Identify.name = "Akthar Musthafa" ;
		Identify.email = "aktharmusthafah.xworkz@gmail.com" ;
		//Identify.moblie = 1234567890L ;
		Identify.age = 24 ;
		Identify.address = "ballari" ;
		Identify.gender = 'm' ;
		Identify.working = "xworkz" ;
		Identify.shirtSize = 43 ;
		Identify.pantSize = 32 ;
		Identify.weight = 70 ;
		Identify.height = 5.10 ;
		
		System.out.println("Name " +Identify.name );
		System.out.println("Name and age " +Identify.name + Identify.age);
		System.out.println("Name and address " + Identify.name + Identify.address);
		System.out.println("Name and address and age " + Identify.email + Identify.address + Identify.age);
		System.out.println("Gender " + Identify.gender);
		System.out.println("working " + Identify.working);
		System.out.println("shirtSize " + Identify.shirtSize);
		System.out.println("pantSize " + Identify.pantSize);
		System.out.println("weight and height " + Identify.weight + Identify.height);
	}
}