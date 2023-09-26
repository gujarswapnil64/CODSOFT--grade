package Grade1;
import java.util.*;
public class grade {
      public static void main(String[] args) {
		int total,len;
		float per;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
		System.out.println("Enter the Physics Sub Marks:\n");
		int sub1=sc.nextInt();
		System.out.println("Enter the Chem Sub Marks:\n");
		int sub2=sc.nextInt();
		System.out.println("Enter the Bio Sub Marks:\n");
		int sub3=sc.nextInt();
		System.out.println("Enter the Math Sub Marks:\n");
		int sub4=sc.nextInt();
		System.out.println("Enter the IT Sub Marks:\n");
		int sub5=sc.nextInt();
		
		total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total Marks:>"+total+"/500");
		  per=total*100/500;
		  System.out.println("Per =>"+per);
		  if(per>90)
		  {
			  System.out.println("A Grade\n");
		  }
		  else if(per<=90 && per>80)
		  {
			  System.out.println("B Grade\n");
		  }
		  else if(per<=80 && per>70)
		  {
			  System.out.println("C Grade\n");
		  }
		  else if(per<=70 && per>60)
		  {
			  System.out.println("D Grade\n");
		  }
		  else if(per<=60 && per>50)
		  {
			  System.out.println("E Grade\n");
		  }
		  else
		  {
			  System.out.println("Fail\n");
		  }
	}
   }
 }
