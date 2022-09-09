
public class EX04_07 {

	public static void main(String[] args) {
		double tuition = 10000; double increase=0; int increament = 5; 
		for(int i=1;i<=15;i++) {
		increase=((tuition)*(increament/100.0));
		increament+=5;
		if(i==10) {
			double after10 = increase+tuition;
			System.out.println("the tuition after 10 years is $"+ after10);
		}
		else if(i==15) {
			double after15 = increase+ 4*tuition;
			System.out.println("the total cost of four years worth of tuition starting ten years from now $"+after15);
		}
			
		}
		

	}

}
