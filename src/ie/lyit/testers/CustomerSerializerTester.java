package ie.lyit.testers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import ie.lyit.serialize.CustomerSerializer;
public class CustomerSerializerTester {
	
	/**
	 * @author Berkan
	 * 
	 * CustomerSerializerTester uses methods created in the CustomerSerializer to test them
	 * on first Loading there will be an error thrown which states that there is no text data created
	 * 
	 * 
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
 

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// initializing inputstream bufferedreater and customserializer
		InputStreamReader isr = new InputStreamReader(System.in);
		CustomerSerializer cusSerialize = new CustomerSerializer();
		BufferedReader br = new BufferedReader(isr);
	    int execute = 0;
	    boolean quit = false;
	    cusSerialize.loadFile();
	    
	  
	    
	    /**
	     * @author Berkan
	     * Menu will be made via Syso outputs for test purposes
	     * 
	     */
	    do {
		System.out.println("Menu:_____________");
		System.out.println("1. View a Customer by ID");
		System.out.println("2. Show all Customers");
		System.out.println("3. Create a new Customer");
		System.out.println("4. Edit an existing Customer");
		System.out.println("5. Delete a Customer");
		System.out.println("6. Quit");
		System.out.println("Enter Number of Menu");
		System.out.println("__________________");
	
		String executable = br.readLine();
		execute = Integer.parseInt(executable);
		
		switch (execute) 
		{
			case 1 : 
				System.out.println("Please enter the id: ");
				int id = Integer.parseInt(br.readLine());
				cusSerialize.viewCustomer(id);
			break;
			case 2:
				cusSerialize.listCustomer();
			break;
			case 3:
				
				System.out.println("Please enter the title: ");		
				String title = br.readLine();
				System.out.println("Please enter the firstname: ");	
				String fn = br.readLine();
				System.out.println("Please enter the surname: ");
				String sn = br.readLine();
				System.out.println("Please enter the country: ");
				String l = br.readLine();
				System.out.println("Please enter the town: ");
				String tow = br.readLine();
				System.out.println("Please enter the street: ");
				String street = br.readLine();
				System.out.println("Please enter the streetNumber: ");
				int streetNr = Integer.parseInt(br.readLine());
				System.out.println("Please enter the email adress: ");
				String emailAdress  = br.readLine();
				System.out.println("Please enter the phoneNumber: ");
				int phoneNr  = Integer.parseInt(br.readLine());
				cusSerialize.addCustomer(title, fn, sn, l, tow, street, streetNr, emailAdress, phoneNr);	 
			break;
			case 4:
				System.out.println("Please enter the id: ");
				id = Integer.parseInt(br.readLine());
				
				System.out.println("Please enter the title: ");		
				title = br.readLine();
				System.out.println("Please enter the firstname: ");	
				fn = br.readLine();
				System.out.println("Please enter the surname: ");
				sn = br.readLine();
				System.out.println("Please enter the country: ");
				l = br.readLine();
				System.out.println("Please enter the town: ");
				tow = br.readLine();
				System.out.println("Please enter the street: ");
				street = br.readLine();
				System.out.println("Please enter the streetNumber: ");
				streetNr = Integer.parseInt(br.readLine());
				System.out.println("Please enter the email adress: ");
				emailAdress  = br.readLine();
				System.out.println("Please enter the phoneNumber: ");
				phoneNr  = Integer.parseInt(br.readLine());
				
				cusSerialize.editCustomer(id, title, fn, sn, l, tow, street, 
						streetNr, emailAdress, phoneNr);
				
			break;
			case 5:
				System.out.println("Please enter the id: ");
				id = Integer.parseInt(br.readLine());
				cusSerialize.deleteCustomer(id);
			break;
			case 6:
			 quit = true;
			break;
		}
		
	    }while(quit == false);
	    
	    cusSerialize.saveFile();
		
	}

}
