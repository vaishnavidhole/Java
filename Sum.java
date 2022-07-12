import java.util.Scanner;

class Sum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int c=a+b;
       
        System.out.println("Sum: "+c);
    }
}