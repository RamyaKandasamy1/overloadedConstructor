package overloadedConstructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza=new Pizza("Thickcrest","Tomato","cedar");
		System.out.println(pizza.bread);
		System.out.println(pizza.Sauce);// will return Null bcoz we are not passing this argument 
	
		System.out.println(pizza.cheese);
		System.out.println(pizza.toppings);

}

}
	