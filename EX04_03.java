import java.util.Scanner;
public class EX04_03 {

	public static void main(String[] args) {
		double kgs; int count=0; double pounds;
	Scanner input = new Scanner(System.in);
System.out.println("Enter your weight in kilograms please to exit press 0");
System.out.print("kilograms");
System.out.print("               ");
System.out.println("pounds");
do {
	 kgs = input.nextDouble();
	 pounds = kgs*2.2;
	count++;
	System.out.print(kgs);
	System.out.print("               ");
	System.out.println(pounds);
	if(count%2==0)
		System.out.println("-----------------------------------------");
}while(kgs!=0);

}
	}


