package ie.lyit.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
/**
 * @author Berkan
 * 
 * TestClass for Singleton Object in this case a welcome Message
 */
	

		  //Get the only object available
	      SingleObject object = SingleObject.getInstance();
	
	      //show the message
	      object.showMessage();
	      
	}
}
