import java.util.*;

class Constr
{
	int i, j, n, m ;

	int Burst_Time[] = new int[10];
	int process_no[] = new int [10];
	float billing_amt[] = new float[10];
	float price;



	void bill_generate()
	{
		System.out.print( "STUDENT_NO\t\t\t    NUMBER OF GIFTS PURCHASED\t\t\t       BILL\n\n"); 

	 for (i = 0; i < n; i++) 

		 { 

	 	System.out.print("STUDENT NO. = " + process_no[i]);

		 System.out.print(" \t\t\t\t" + Burst_Time[i]);

		 billing_amt[i]= price * Burst_Time[i]; //   calculating cost 
	 	System.out.print(" \t\t\t\t\t" + billing_amt[i]); 

	 System.out.print("\n");

	 }

	}

	void result() //list of gifts taken by students (user input)
	{

	System.out.print("\n\n");
    System.out.print("******************************0******** DATA  ENTERED SUCCESSFULLY ********************************************\n\n");
	System.out.print("PROCESSING DATA. ");
	for(int a=0;a<30;a++){
	System.out.print(". ");
	}
	System.out.print( "\nSTUDENT NUMBER.\t\tNO.OF GIFTS PURCHASED... \n"); 
	 for (i = 0; i < n; i++)

	 { 

		System.out.print("STUDENT NO. = "  + process_no[i]); //process no


		System.out.print(" \t\t\t" + Burst_Time[i]); //  brust time

	System.out.print("\n\n");

	 } 

	}

	void pri_sort() //arrangement of students according to quantity of gifts chosen 

{ 

	System.out.print("************************************ SEQUEUNCE OF BILLED STUDENTS ******************************************* \n\n");

	 for(i=0;i<n;i++)

{

	 for(j=i+1;j<n;++j)

			 {

		 if(Burst_Time[i]<Burst_Time[j]) //student with max no of gifts is given highest priority

					{

		 m=Burst_Time[i]; //swapping method 

	 Burst_Time[i]=Burst_Time[j];

	Burst_Time[j]=m;


	m=process_no[i]; //  m is temporary variabl

	process_no[i]=process_no[j]; //swapping 

	process_no[j]=m;

}
}


} }

}

public class Onetryboijav
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Constr c = new Constr();
		
        System.out.print("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.print("*************************************************************************************************************\n");
        System.out.print("                             B  I  L  L  I  N  G      C  O  U  N  T  E  R   :-                               \n");
		System.out.print("\n          ENTER THE TOTAL STUDENTS WHO ARE PURCHASING THE GIFT :-               "); // process number initialization


		c.n = sc.nextInt();

		System.out.print("\n          PLEASE ENTER THE COST OF ONE GIFT IN RUPEES  :-                       "); 

		c.price = sc.nextFloat();

		System.out.println("\n\n***************  NOW PLEASE ENTER THE NUMBER OF GIFTS PURCHASED BY EACH STUDENT INDIVIDUALLY  *************");

		for(int i=0;i<c.n;i++)

		{

		System.out.printf("\nSTUDENT [%d] \n",i+1);

		System.out.print("\nENTER THE TOTAL GIFTS PURCHASED BY THE STUDENT:");//user input data

		c.Burst_Time[i] = sc.nextInt();

		c.process_no[i]=i+1; 

		}

		c.result();
		c.pri_sort();
		c.bill_generate();
	}
}
