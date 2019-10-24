package SEE;
import CIE.Student;
import java.util.*;

public class External extends Student
{
Scanner scan=new Scanner(System.in);
public int n;
public double exarr[];
public void getdata()
{
	
exarr = new double[5];
System.out.println("Enter the name: ");
name = scan.next();
System.out.println("Enter the usn: ");
usn = scan.next();
System.out.println("Enter the sem: ");
sem = scan.nextInt();
System.out.println("Enter the exmarks: ");
		
}
public void setdata()
{
for(int i=0;i<5;i++)
{
exarr[i] = scan.nextDouble();
exarr[i] = (double)exarr[i]/2;
}
}
}
