import java.util.Scanner;
public class EX04_01 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 int negCounter=0; int posCounter=0; double average=0; int count=0;
	
System.out.println("enter the numbers please, if you wanna exit the program type 0.");
int x = input.nextInt();
if(x>0)
	posCounter++;
else if(x<0)
	negCounter++;
int total=x;
while(x!=0){
	x = input.nextInt();
	total+=x;
	count++;
	if(x>0) {
		posCounter++;
	}
	else if (x<0) {
		negCounter++;
	}
}
average=total/count;
System.out.println("the number of positives is "+posCounter);
System.out.println("the number of negatives is "+negCounter);
System.out.println("the total is "+total);
System.out.println("the average is "+average);
}
}