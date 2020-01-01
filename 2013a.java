import java.util.Scanner;
class a2013{
    public static void main(String[] args){
        int height = -1;
        while (!(height < 100 && height > 0)){
            height = input("Enter the height of the triangle. Values must be greater than 0 or less than 100");
        }
        drawTriangle(height);
    }

    public static void drawTriangle(int height){
        for (int i =0; i < height; i++){
            for (int j =0; j < i+1; j ++){
                System.out.print("**"); 
            }
            System.out.println("");
        } 
    }
   
    public static int input(String m){
        System.out.println(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}