package ie.lyit.testers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import ie.lyit.hotel.Name;

public class NameTester {

	public static void main(String argv[]) throws IOException
	{
		String title, firstName, surname;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Name> names = new ArrayList<Name>();
		System.out.println("This Programm takes 3 Names with titles as Input und tests a few things...");
		
		for(int i = 0;i < 3 ;i++)
		{
			System.out.print("Title : ");
			title = input.readLine();
			System.out.println();
			System.out.print("First Name : ");
			firstName = input.readLine();
			System.out.println();
			System.out.print("Surname : ");
			surname = input.readLine();
			
			names.add(new Name(title, firstName, surname));
			if(i == 2)
			{
				names.add(new Name(title, firstName, surname));
			}
		}
		
		for (Name name : names) 
		{
			System.out.println(name);
		}
		
		for(int i = 0; i < 2; i++)
		{
			if(names.get(i).isFemale())
			{
				System.out.println(names.get(i) + " is female.");
			}else
			{
				System.out.println(names.get(i) + " is male.");
			}
		}
		
		for(int i = 0; i < 4; i+=2)
		{
			if(names.get(i).equals(names.get(i+1)))
			{
				System.out.println(names.get(i) + " and " + names.get(i+1) + " are equal");
			}else
			{
				System.out.println(names.get(i) + " and " + names.get(i+1) + " are not equal");
			}
		}
		
		System.out.println("Now change the First Name of " + names.get(0) + " into something else.");
		firstName = input.readLine();
		names.get(0).setFirstName(firstName);
		System.out.println("His / Her full name is now : " + names.get(0));
		
		System.out.println("Now change the Surname of " + names.get(1) + " into something else.");
		surname = input.readLine();
		names.get(1).setSurname(surname);
		System.out.println("His / Her full name is now : " + names.get(1));
	}
	
	public boolean nameSearch(Name searchedName , ArrayList<Name> names)
	{
		for(Name name : names)
		{
			if(searchedName.equals(name))
			{
				return true;
			}
		}
		
		return false;
	}
	
}
