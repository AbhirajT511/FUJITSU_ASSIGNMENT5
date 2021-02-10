class Animal
{
	void shout()
	{

	}
}

class Horse extends Animal
{
	void shout()
	{
		System.out.println("Horse says Neigh");
	}
}

class Dog extends Animal
{
	void shout()
	{
		System.out.println("Dog says Bow Bow");
	}
}

class Cat extends Animal
{
	void shout()
	{
		System.out.println("Cat says Meow");
	}
}
public class Polymorphism 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Animal ani;
		ani=new Horse();
		ani.shout();
		ani=new Dog();
		ani.shout();
		ani=new Cat();
		ani.shout();
	}
}
