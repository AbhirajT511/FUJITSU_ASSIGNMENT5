import java.util.Scanner;

public class Age 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int children=0, adult=0, senior_citizen=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int age[] = new int[size];
		System.out.println("enter age values");
		for(int i=0;i<size;i++)
		{
			age[i]=sc.nextInt();
		}
		for(int i=0;i<age.length;i++)
		{
			if(age[i]<18)
			{
				children=children+1;
			}
			else if(age[i]>=18 && age[i]<=54)
			{
				adult=adult+1;
			}
			else
			{
				senior_citizen=senior_citizen+1;
			}
		}
		System.out.println("Children: "+children);
		System.out.println("Adult: "+adult);
		System.out.println("Senior Citizen: "+senior_citizen);
	}

}
