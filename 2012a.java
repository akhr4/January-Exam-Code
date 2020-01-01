import java.util.*;
class a2012{
    public static void main(String[] args){
        int choice = -1;
        while (!(choice == 1 || choice == 2)){
            choice = input("Would you like to draw 1) Triangle or 2)Square?");
        }
        if (choice ==1){
            drawTriangle();
        }
        else{
            drawSquare();
        }
    }

    public static void drawTriangle(){
        int height = input("Enter height");
        for (int i =0; i < height; i++){
            for (int j =0; j < i+1; j ++){
                System.out.print("*"); 
            }
            System.out.println("");
        }
        
    }
    public static void drawSquare(){
        int height = input("Enter height");
        for (int i=0; i< height; i++){
            for (int j = 0; j < height; j++){
                System.out.println("*");
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