import java.util.Scanner;
class Animal
{
	public void sound(String animal)
	{
		System.out.print(" this is a "+animal);
	}
}
class Dog extends Animal
{
	public void sound()
	{
		System.out.println(" I am Dog");
	}
}
class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Dog D1=new Dog();
		D1.sound();
		String animal;
		System.out.print("Enter animal: ");
		animal=in.next();

		D1.sound(animal);



	}
}