import java.util.Scanner;
public class Mainpgm {
    

    public void checkPalindrome(){
    
        int num , sum=0, r, temp;
        Scanner  scii = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scii.nextInt();
        temp = num;
        while(num>0){
        r = num %10;
        sum = (sum*10)+r;
        num = num /10;
        }
        if(temp == sum)
        System.out.println("number is Palindrome");
        else
        System.out.println("not a Palindrome number");
        System.out.println();
}
    public void printPattern(){
    Scanner sci = new Scanner(System.in);
    int i,j, rows;
    System.out.print("Enter any interger value for pattern length: ");
    rows = sci.nextInt();
    for(i=1;i<=rows;i++)
    {
        for(j=rows; j>=i; j--)
        {
            System.out.print("*");

        }
        System.out.println();
    }
    System.out.println();
}
public void printFibonacciSeries()
    {
    int a = 0, b = 1, c, n;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the length of the Fibonacci Series: ");
    n = sc.nextInt();
    System.out.print(a+" "+b);
    for(int i=2; i<=n; i++)
    {
        c = a + b;
        System.out.print(" "+c);
        a = b;
        b = c;
    }
    System.out.println();
    System.out.println();
    }
    public void checkPrimeNumber() {
        int number;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number= sc.nextInt();
        if (number == 1){
            System.out.println("1 i neither prime nor composite");
        }
        else if(number>1){
            for(int i=2;i<number;i++){
                if(number%i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number+" is a prime number");
            }
            else
            System.out.println(number+" is not a prime number");
        }
        else{
            System.out.println("number is not a prime number");
        }
        System.out.println();        
    }

    public static void main(String args[]){ 
        Mainpgm obj = new Mainpgm();
        int choice;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"          
            + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"           
            + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");          
            choice = scn.nextInt();            
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
            
            }while (choice != 0);

            System.out.println("Exited Successfully!!!");
            scn.close();
            
}     
}
