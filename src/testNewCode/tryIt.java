package testNewCode;

import java.util.Random;

public class tryIt {
	public static void main(String []args) {
		
		Random rand = new Random();

	    int num1, num2, num3, num11;

	    num1 = rand.nextInt (3) + 6;
	    num11= rand.nextInt(9);
	    num2 = rand.nextInt (643) + 100;
	    num3 = rand.nextInt (9000) + 1000;

	    System.out.println(0+""+num1+num11+" "+num2+" "+num3);
	}
}
