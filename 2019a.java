import java.util.Scanner; 
class a2019{
    public static void main(String[] args){
        int height = input("Enter height");
        int width = input("Enter width");
        int interval = input("Enter interval");
        draw(height, width, interval);
    }

    public static void draw(int height, int width, int interval){
        for (int i=0; i< height; i++){
            System.out.println();
            for (int j=1; j <= width; j++){
                if (j % interval == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print("o");
                }
            }
        }
    }

    public static int input(String m){
        System.out.println(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}