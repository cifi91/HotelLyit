package ie.lyit.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import ie.lyit.hotel.Adress;
import ie.lyit.hotel.Customer;
import ie.lyit.hotel.Name;

public class CustomerSerializer implements java.io.Serializable {
	
	
	/**
	 * @author Berkan
	 * The customer serializer class is for data persistence management and also for loading
	 * and saving the data file created the functions are to add, edit, delete, view and list customers
	 * this class uses an ArrayList of the Customer class
	 * 
	 */
	
	//"transient" -  for not seriazable data
	private int id = 0;
	private ArrayList<Customer> cusList = new ArrayList<Customer>();
	private Customer c;
	
	
	//loading text file
	public void loadFile() throws FileNotFoundException, ClassNotFoundException {
		try {
	        FileInputStream fileIn = new FileInputStream("Test.txt");
	   
	        ObjectInputStream in = new ObjectInputStream(fileIn);
	       
	       	 cusList = (ArrayList<Customer>) in.readObject();	                 
	        in.close();
	     } catch (IOException i) {
	        i.printStackTrace();
	       	     
	     }
	}
	
	//saving textfile
	public void saveFile() throws FileNotFoundException {
		try {
	         FileOutputStream fileOut = new FileOutputStream("Test.txt");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(cusList); 
	         out.close();
	         System.out.printf("Serialized data is saved in Test.txt");
	      
		} catch (IOException i) 
		  {
	         i.printStackTrace();
	      }
	}
	
	
	// create a new Customer
	public void addCustomer(String t,String fn,String sn,String l,String tow,String street,int streetNr,String emailAdress,int phoneNr) {
		
		if(cusList.size() < 1) {
			id = 0;
		}else {
			Customer getLastId = cusList.get(cusList.size()-1);
			id = getLastId.getNumber();
		}
		Customer c = new Customer(t,fn,sn,l,tow,street,streetNr,emailAdress,phoneNr, id);
		cusList.add(c);
		
	}

	//edit customer data via ID
	public void editCustomer(int id, String title, String firstName, String surname,
			String country, String town, String street, int streetNr, 
			String emailAdress, int phoneNr) {
		for(int i = 0; i < cusList.size(); i++) {
			if(id == cusList.get(i).getNumber())
			{
				Adress a = new Adress(street, town, country, streetNr);
				Name n = new Name(title, firstName, surname);
				
				cusList.get(i).setAdress(a);
				cusList.get(i).setName(n);
				cusList.get(i).setEmailAdress(emailAdress);
				cusList.get(i).setPhoneNr(phoneNr);
			}	 
		}
	}

	// delete Customer via id
	public void deleteCustomer(int id) {
		for(int i = 0; i < cusList.size(); i++) {
			if(id == cusList.get(i).getNumber())
			{
				cusList.remove(i);
			}	 
		}
	}

	
	// show single customer via ID
	public void viewCustomer(int id) {
			
			for(int i = 0; i < cusList.size(); i++) {
				if(id == cusList.get(i).getNumber())
				{
					System.out.println("Title: " + cusList.get(i).getName().getTitle());
					System.out.println("Firstname: " + cusList.get(i).getName().getFirstName());
					System.out.println("Surstname: " + cusList.get(i).getName().getSurname());
					System.out.println("Country: " + cusList.get(i).getAdress().getLand());
					System.out.println("Town: " + cusList.get(i).getAdress().getTown());
					
				}
				 
			}
	}

	// show a list of all customers available
	public void listCustomer() {
		for(int i = 0; i < cusList.size(); i++) {
			
				System.out.print("Title: " + cusList.get(i).getName().getTitle()+ " ");
				System.out.print("Firstname: " + cusList.get(i).getName().getFirstName()+ " ");
				System.out.print("Surname: " + cusList.get(i).getName().getSurname()+ " ");
				System.out.println("ID: " + cusList.get(i).getNumber());
		}
	}

}
