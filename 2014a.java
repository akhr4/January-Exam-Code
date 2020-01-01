import java.util.Scanner;
class a2014{
    public static void main(String[] args){
        int a = input("Enter integer a: ");
        int b = input("Enter integer b: ");
        int c = input("Enter integer c: ");
        calculator(a,b,c);
    }
    public static void calculator(int a, int b, int c){
        int sum = 0;
        String type; 
        for (int i=0; i < c; i++){
            sum = sum + a*b;
            //System.out.println("Parse " + (i+1) + ":" + sum);
        }
        if ((sum % 2) == 0){
            type = "even";
        }
        else{
            type = "odd";
        }
        System.out.println(sum + " is " + type);
    }
    
    public static int input(String m){
        System.out.println(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}