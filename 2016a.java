import java.util.Scanner;
class a2016{
    public static void main(String[] args){
        int width = input("Enter width:");
        int height = input ("Enter height:");
        showFlag(width, height);
    }

    public static void showFlag(int width, int height){
        for (int col = 0; col < height; col ++){
            for (int row = 0; row < width; row ++){
                if (col % 2 == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }

    public static int input(String m){
        System.out.println(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}