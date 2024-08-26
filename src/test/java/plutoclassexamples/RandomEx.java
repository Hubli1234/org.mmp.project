package plutoclassexamples;
import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int randint = rand.nextInt(100);
		System.out.println("Random Integer"+randint);

		//int i1 = i;
		//char ch = (char)i1;
		
		
		//Random Characters A-Z, a-z
		char UpperChar = (char) (65 + rand.nextInt(26)); //LBound+rand.nextint(Ubound-Lbound)
		System.out.println("Random Upper Case ---" +UpperChar);
		
		char LowerChar = (char) (97 + rand.nextInt(26)); //LBound+rand.nextint(Ubound-Lbound)
		System.out.println("Random LowerCase ---" +LowerChar);

		//Random Special Characters
		char specialChar = (char)(33 + rand.nextInt(48-33));
		System.out.println("Random Special Char---" +specialChar);
		 
		//Random email id
		
		String fullName = "IITwFQA"+UpperChar+LowerChar;
		String emailID = "IITwFQA"+UpperChar+LowerChar+randint+"@yahoo.com";
		String password = fullName+specialChar+specialChar;
		
		System.out.println("Full Name-----"+fullName);
		System.out.println("emailID------"+emailID);
		System.out.println("password------"+password);
		
		

	}

}
