import java.util.Scanner;
class a2007{
    public static void main(String[] args){
        String baby = " and are under 5, entry is free";
        String young = " and in the 5-18 age range, entry will cost you 2 pounds";
        String adult = " and in the 19-64 age range, entry will cost you 3 pounds";
        String old = " and in the 65+ age range, entry will cost you 2 pounds";
        userChoice(baby, young,adult,old);
    }

    public static void userChoice(String baby, String young, String adult, String old){
        int choice = 0;
        while (choice != -1){
            choice = input("Age?");
            if (choice == -1){
                break;
            }
            if ((choice < -1) | (choice > 120)){
                System.out.println("Invalid age, try again");
            }
            else if (choice < 6){
                System.out.println("As you are " + choice + baby);
            }
            else if (choice < 19){
                System.out.println("As you are " + choice + young);
            }
            else if (choice < 65){
                System.out.println("As you are " + choice + adult);
            }
            else if ((choice > 64) & (choice < 121)){
                System.out.println("As you are " + choice + old);
            }
        }
        System.out.println("goodbye");
    }


    public static int input(String m){
        System.out.println(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}