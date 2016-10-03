public class Puppy
{
	int puppyAge;
	
	public Puppy(String name)
	{
		//constructor
		// has one parameter, name
		System.out.println("Passed Name is :" + name);
	}
	
	public void setAge(int age)
	{
		puppyAge = age;
	}
	
	public int getAge()
	{
		System.out.println("Puppy's age is : " + puppyAge);
		return puppyAge;
	}
	public static void main(String [] args)
	{
		//following statement creates an object myPuppy
		Puppy myPuppy = new Puppy( "tommy" );
		
		myPuppy.setAge(2);
		myPuppy.getAge();
		
		//or i can do a variation like this
		System.out.println(myPuppy.puppyAge);
	}
}