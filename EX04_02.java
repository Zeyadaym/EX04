import java.util.Scanner;
public class EX04_02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	int rightAnswers=0; int wrongAnswers=0;
	long x1=System.currentTimeMillis();
	int num1=0;int num2=0;
for(int i = 1; i<=10;i++) {
	 num1=(int)(Math.random()*16);
	 num2=(int)(Math.random()*16);
	System.out.println("what is sum of "+ num1 +" + "+ num2 +" ?" );
	int answer = input.nextInt();
	System.out.println("your answer is "+ (num1+num2==answer));
	if(num1+num2==answer)
		rightAnswers++;
	else
		wrongAnswers++;
}
long x2=System.currentTimeMillis();
long time = (x2-x1)/1000;
System.out.println("the time you took to finish your questions is "+time+" seconds");
System.out.println("you answered "+ rightAnswers+ " questions right and "+ wrongAnswers+ " wrong ");
	}

}
