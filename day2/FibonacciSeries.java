package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n1,n2;
		 n1=0;
		 n2=1;
		 int sum=n1+n2;
		 
		 int i;
		 System.out.println(n1);
		 System.out.println(n2);
		 for (i=0;i<6;i++)
		 {
			 n1=n2;
		     n2=sum;
		     sum=n1+n2;
		     System.out.println(sum);
		 }
		 

	}

}
