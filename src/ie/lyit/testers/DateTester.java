package ie.lyit.testers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import ie.lyit.hotel.Date;

public class DateTester {

	public static void main(String argv[]) throws IOException
	{
		String str;
		int day,month,year;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Date> dates = new ArrayList<Date>();
		System.out.println("This Programm takes 3 Dates with titles as Input and tests a few things...");
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Day : ");
			str = input.readLine();
			day = Integer.parseInt(str);
			
			System.out.print("Month : ");
			str = input.readLine();
			month = Integer.parseInt(str);
			
			System.out.print("Year : ");
			str = input.readLine();
			year = Integer.parseInt(str);
			System.out.println();
			
			dates.add(new Date(day, month, year));
			if(i == 2)
				dates.add(new Date(day, month, year));
		}
		
		for(Date date : dates)
		{
			System.out.println(date);
		}
		
		System.out.println("Change the Day for the first Date " + dates.get(0) + " to something else.");
		str = input.readLine();
		day = Integer.parseInt(str);
		dates.get(0).setDay(day);
		System.out.println("The first Date is now : " + dates.get(0));
		
		System.out.println("Change the Month for the second Date " + dates.get(1) + " to something else.");
		str = input.readLine();
		month = Integer.parseInt(str);
		dates.get(1).setMonth(month);
		System.out.println("The second Date is now : " + dates.get(1));
		
		for(int i = 0; i < 4; i += 2)
		{
			if(dates.get(i).equals(dates.get(i + 1)))
			{
				System.out.println("The Dates " + dates.get(i) + " and " + dates.get(i + 1) + " are equal.");
			}else
			{
				System.out.println("The Dates " + dates.get(i) + " and " + dates.get(i + 1) + " are not equal.");
			}
		}
	}
	
}
