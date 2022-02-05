import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	
		Scanner inputTaker = new Scanner(System.in);
		String str1 = inputTaker.nextLine();
		String str2 = inputTaker.nextLine();

		int[] countArr1 = new int[26];
		int[] countArr2 = new int[26];

		for(int i = 0;i< str1.length(); i++){
			countArr1[str1.charAt(i) - 'a']++;
		}

		for(int i = 0;i< str2.length(); i++){
			countArr2[str2.charAt(i) - 'a']++;
		}

		int sum = 0;
		for(int i =0;i<26;i++){
			sum+= Math.abs(countArr2[i] - countArr1[i]);
		}

		sum = sum%6;
		switch(sum){

			case 1:{
				System.out.println("Friends");
				break;
			}
			case 2:{
				System.out.println("Love");
				break;
			}
			case 3:{
				System.out.println("Affection");
				break;
			}
			case 4:{
				System.out.println("Marriage");
				break;
			}
			case 5:{
				System.out.println("Enemy");
				break;
			}
			default: System.out.println("Siblings");
		}
		
	}
}