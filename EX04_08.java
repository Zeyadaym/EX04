import java.util.Scanner;
public class EX04_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name2;
		double score2;
		double bestscore=0;
		String bestname = null;
System.out.println("Enter students number please ");
int num=input.nextInt();
System.out.println("Enter the name of student number 1");
String name1= input.next();
System.out.println("Enter the degree of student number 1");
double score1=input.nextInt();
for(int i=2;i<=num;i++) {
	System.out.println("Enter the name of student number "+i);
	name2=input.next(); 
	System.out.println("Enter the degree of student number "+i);
	score2=input.nextInt();
if(score2>score1) {
	bestscore=score2;
	bestname=name2;
}
else if(score1>score2) {
	bestscore=score1;
	bestname=name1;
}
else {
	bestscore=score1;
	bestname=name1;
}

}
System.out.println("the best student is " + bestname + " and his/her degree is " + bestscore);
	}

}
