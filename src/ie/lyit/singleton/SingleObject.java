package ie.lyit.singleton;

public class SingleObject {

	
	/**
	 * @author Berkan
	 * 
	 * Advantage of singleton having an object that cannot be instantiated more than once
	 * 
	 */
	
	
		   //create a single object
		   private static SingleObject instance = new SingleObject();

		   //make the constructor private to avoid being able to be instantiated
		   
		   private SingleObject(){}

		   //Get the only object available
		   public static SingleObject getInstance(){
		      return instance;
		   }

		   public void showMessage(){
		      System.out.println("Welcome To Customer Service");
		   }
		}

