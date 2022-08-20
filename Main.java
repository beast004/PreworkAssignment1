import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);

//function to checkPalindrome
public void checkPalindrome()  {
	
	int num;
	

	System.out.println("Enter the num to check Palindrome:");
	
	num = sc.nextInt();
	
	int orig = num; //stores original num for comparison.
	int rev = 0; // stores reverse num for comparison.
	
	while(num>0) {
		rev = (rev*10) + (num%10);
		num = num/10;
		
	}
	if(rev == orig) {
		System.out.println("Number is Palindrome");
	} else {
		System.out.println("Number is not a Palindrome");
		
	}
	System.out.println("\n");

}


//function to printPattern
public void printPattern() {
	
	int num;
	System.out.println("Enter the number to print decreasing stars:");
	num = sc.nextInt();
	
	for (int i = num; i>0;i--) {
		
		for (int j = 1; j<=i;j++) {
			System.out.print("*");
			
		}
		
		System.out.println("\n");
	}
	System.out.println("\n");
}


//function to check no is prime or not
public void checkPrimeNumber() {
	
int num;
int count=0;
	

	System.out.println("Enter the num to check if it is Prime or not:");
	
	num = sc.nextInt();
	
	for(int i=2; i<=num/2; i++)

	{

	if(num%i == 0)

	{

	count++;

	break;

	}

	}

	if(count == 0)

	{

	System.out.print("This is a Prime Number");
	}

	else

	{

	System.out.print("This is not a Prime Number");

	}
	System.out.println("\n");



 }

  

// function to print Fibonacci Series
public void printFibonacciSeries() {
	
	int num;
	System.out.println("Enter the number to print Fibonaci series:");
	num = sc.nextInt();
	
	long i=0;
	long j=1;
	int check_num=1;
	
	System.out.print("0 ");
	
	while (check_num<=num) {
		j = j+i;
		
		System.out.print(j+" ");
		
		i = j-i;	
		check_num++;
	}
	System.out.println("\n");
	
}

//initialize the first and second value as 0,1 respectively.
int first = 0, second = 1;

   


	public static void main(String[] args) {
	
		
		 Main obj = new Main();

         int choice;

         Scanner sc = new Scanner(System.in);

do 
{

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n" 
+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println(); 


	

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 


} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();
	}
}

	


