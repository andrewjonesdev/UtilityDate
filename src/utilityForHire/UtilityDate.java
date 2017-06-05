package utilityForHire;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class UtilityDate {

	public UtilityDate() {
		// TODO Auto-generated constructor stub
	}
	public static String displayCalendar(int month, int year){
		//System.out.println("Enter the month you want a calendar for (ex. January 2, 2017 = 1): ");
		//checks if letters are input
		int givenDay = 1;
		int givenMonth = month;
		int givenYear = year;
		LocalDate date = LocalDate.now();
		String output ="";
			//checks if the day is valid
			if(givenMonth < 1 || givenMonth > 13){
				System.out.println("The month you entered wasn't valid. Please try again.");					
			}
			//checks if the day exists in this month
			
		
	
	//Year Input
	
			
			//checks if the user has given a date that hasn't occured yet
			
			//checks if date is real or not. B.C. is not accepted
			if(givenYear<0){
				System.out.println("The year you entered wasn't valid. Please try again.");	
			}
			else if ((Integer.toString(givenYear)).length()<4){
				System.out.println("Give a 4 digit year or greater (ex: 0001 0021 0201 2001):");
			}
			
		
	
	//Verifies if your birthday has occurred this year and assigns a value. SEE NEXT COMMENT
	
	date = LocalDate.of(givenYear, givenMonth, givenDay);
	//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
	//System.out.println(LocalDate.parse(date, formatter));
	//System.out.println(LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE));
	//DayOfWeek.of(3);
	//System.out.println(date.getDayOfWeek());
	//System.out.println((date.getDayOfWeek()).getValue());
	//System.out.println(date.getMonth().length(givenYear%4==0));
	//System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s", sun, mon, tue, wed, thu, fri, sat);
	output+=("\t\t\t" + date.getMonth()+"\n");
	output+=String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s", (DayOfWeek.of(7)).toString().substring(0,3), (DayOfWeek.of(1)).toString().substring(0,3), (DayOfWeek.of(2)).toString().substring(0,3), (DayOfWeek.of(3)).toString().substring(0,3), (DayOfWeek.of(4)).toString().substring(0,3), (DayOfWeek.of(5)).toString().substring(0,3), (DayOfWeek.of(6)).toString().substring(0,3));
	output+="\n";
	int week = 1;
	for(int please = 0; please < ( /*(date.getMonth().length(givenYear%4==0) - */(date.getDayOfWeek()).getValue() )/*)*/; please ++ ){
		output+=("\t");
		week++;
	}
	for(int count = 1; count <= (date.getMonth().length(givenYear%4==0)); count++){
		
		
			if(((date.getDayOfWeek()).getValue())==7){
				output+=(count +"\t");
				
			}
			else{
				output+=(count + "\t");
			}
			if(week == 7){
				week=1;
				output+=("\n");
			}
			else{
				week++;
			}
			date = LocalDate.of(givenYear, givenMonth, count);
		
		//System.out.println();
		
	}
	output+=("\n");
	return output;
	}
	public static int getLastDayOfMonth(int month, int year){
		int givenDay = 1;
		int givenMonth = month;
		int givenYear = year;
		LocalDate date = LocalDate.now();
		String output ="";
			//checks if the day is valid
			if(givenMonth < 1 || givenMonth > 13){
				System.out.println("The month you entered wasn't valid. Please try again.");					
			}
			//checks if the day exists in this month
			
		
	
	//Year Input
	
			
			//checks if the user has given a date that hasn't occured yet
			
			//checks if date is real or not. B.C. is not accepted
			if(givenYear<0){
				System.out.println("The year you entered wasn't valid. Please try again.");	
			}
			else if ((Integer.toString(givenYear)).length()<4){
				System.out.println("Give a 4 digit year or greater (ex: 0001 0021 0201 2001):");
			}
			
		
	
	//Verifies if your birthday has occurred this year and assigns a value. SEE NEXT COMMENT
	
			date = LocalDate.of(givenYear, givenMonth, givenDay);
			return date.lengthOfMonth();
	} 
	public static String toString(int month, int day, int year, String delimiter){
		//System.out.println("Enter the day of the month you were born (ex. January 2, 2017 = 2): ");
		//checks if letters are input
	
			if(day < 0 || day > 31){
				System.out.println("The day you entered wasn't valid. Please try again.");
				return("The day you entered wasn't valid. Please try again.");
			}
			else{
				
			}
	
	
	//Month Input
	
		//System.out.println("Enter the month you were born (ex. January 2, 2017 = 1): ");
		//checks if letters are input
	
			//checks if the day is valid
			if(month < 1 || month > 13){
				System.out.println("The month you entered wasn't valid. Please try again.");
				return("The month you entered wasn't valid. Please try again.");
			}
			//checks if the day exists in this month
			else if(((day>30)&&month == 4)||((day>30)&&month == 6)||((day>30)&&month == 9)||((day>30)&&month == 11)||((day>29)&&month == 2)){
				System.out.println("Day " + day + " doesn't exist in month " + month +". Please try again.");
				return("Day " + day + " doesn't exist in month " + month +". Please try again.");
			}
			else{
				
			}
			//Year Input
	
		//System.out.println("Enter the year you were born (ex. January 2, 2017 = 2017): ");
		//checks if letters are input
		
			//checks if the user has given a date that hasn't occured yet
			if(year<0){
				System.out.println("The year you entered wasn't valid. Please try again.");	
				return("The year you entered wasn't valid. Please try again.");
			}
			else if(((year%4) != 0) && (day > 28) && month == 2){
				System.out.println("There are only 28 days of February in " + year + ". Please try again.");
				return("There are only 28 days of February in " + year + ". Please try again.");
			}
			else{
				
			}
		//if(Integer.toString(month).length()<=2&&Integer.toString(day).length()<=2&&Integer.toString(year).length()==4){
			return String.format("%s%s%s%s%s", month,delimiter,day,delimiter,year);
			
		
	} //prints the date as mm/dd/yyyy
	public static boolean isLeapYear(int year){
		//returns t/f if the year is a leap year
		// leap years are all years divisible by 4 but not 100
		// years that are divisible by 400 are leap years, too
		// is it divisible by 4?
		// Note that the year is not passed as an argument. It could be but 
		// I choose to use the class level private variable for my method.
		boolean bLeapYear = false;
		bLeapYear = (year % 4 == 0);
		// is it divisible by 4 and not 100
		bLeapYear = bLeapYear && (year % 100 != 0);
		// is it divisible by 4 and not 100 unless it's divisible by 400
		bLeapYear = bLeapYear || (year % 400 == 0);
		return bLeapYear;
	}
	
}
