import java.util.Scanner;
class a2017{
    public static void main(String[] args){
        int maxSize = inputInt("Enter maximum size");
        int symmetry = inputInt("Would you like a line of symmetry? \n0)No \n1)Yes");
        String symbol = input("What symbol should be used?");
        draw(maxSize, symmetry, symbol);
    }
    public static void draw(int maxSize, int symmetry, String symbol){
        for (int i =0; i <maxSize+1; i ++){
            printSquare(i,symbol);
        }
        if (symmetry == 1){
            for (int i=1; i <= maxSize * 2; i++){
                System.out.print("-");
            }
            System.out.println();            
        }
        for (int i = maxSize; i >0; i --){
            printSquare(i,symbol);
        }
    }
    public static void printSquare(int i, String s){
            for(int k = 0; k<i; k++){
                for (int j =0; j <i; j++){
                    System.out.print(s);
                }
                System.out.println();
            }
    } 
   public static String input(String m){
        System.out.println(m);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int inputInt(String m){
        return Integer.parseInt(input(m));
    }

}