package algorithmPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.fellowship.Utility.Utility;

public class RegEx {

	public static void main(String[] args) {
		String input="Hello <<name>>,\n"
				+ "We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n" + 
				"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		System.out.println("Enter your first name:");
		String fname=Utility.inputString();
		System.out.println("Enter your last name:");
		String lname=Utility.inputString();
		
		
		String number="987654321";
		
		Date d=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		
		String date=df.format(d);
		
		//to be inserted
		Pattern p0=Pattern.compile("<<[a-z]+>>");
		Pattern p=Pattern.compile("<<[a-z]+( )[a-z]+>>");//<<[a-z]\\s[a-z]>>
		Pattern p1=Pattern.compile("[x]{10}");// \\d{3}-\\d{7}
		Pattern p2=Pattern.compile("../[0-9]{2}/[0-9]{4}");
		// 
		Matcher m0=p0.matcher(input);
		input=m0.replaceAll(fname);
		
		Matcher m=p.matcher(input);
		input=m.replaceAll(fname+" "+lname);
		
		Matcher m1=p1.matcher(input);
		input=m1.replaceAll(number);
		
		Matcher m2=p2.matcher(input);
		input=m2.replaceAll(date);
		System.out.println(input);
		
		
	}

}
