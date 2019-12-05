package algorithmPrograms;


import com.bridgelabz.fellowship.Utility.Utility;

public class GuessNumber {

	

	static int find(int number) {
		
		int low = 0, high = number-1, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("1.guess less than:" + mid + "\n2. guess greater than:"+mid);
					
			int c = Utility.inputInteger();
			
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args) {

		System.out.println("Enter number in N=2^n format: ");
		int number=Utility.inputInteger();
		try {
			System.out.println("guessed no is " + find(number));
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
	}
}