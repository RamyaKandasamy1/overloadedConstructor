package overloadedConstructor;

public class Pizza {
	String bread;
	String cheese;
	String toppings;
	String Sauce;
	Pizza(){
		//constructor
	}
	Pizza(String bread){
		this.bread=bread;
		
	}
	Pizza(String bread,String cheese){
		this.bread=bread;
		this.cheese=cheese;
	}
	Pizza(String bread,String cheese,String toppings){
		this.bread=bread;
		this.cheese=cheese;
		this.toppings=toppings;
	}
	Pizza(String bread,String cheese,String toppings,String sauce){
		this.bread=bread;
		this.cheese=cheese;
		this.toppings=toppings;
		this.Sauce=sauce;
		
	}
}
