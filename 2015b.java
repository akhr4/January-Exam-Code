import java.util.Scanner;
class b2015{
    public static void main(String[] args){
        int size = 1000; 
        String[] name = new String[size];
        String[] dob = new String[size];
        int[] rating = new int[size];
        menu(name,dob,rating);
    }

    public static void menu(String[] name, String[] dob, int[] rating){
        int choice = 0;
        int index = -1;
        while (choice != 4){
            choice = inputInt("1)Input new customer name, date of birth,credit rating\n2)Change the credit rating of a given customer\n3) find and print a given customer’s credit rating\n4) close down the program.");
            if (choice == 1){
                index = index + 1;
                enterDetails(index,name,dob,rating); 
            }
            else if (choice == 2){
                changeRating(index,name,dob,rating);
            }
            else if (choice == 3){
                printRating(index, name,dob,rating);
            }
            else if (choice == 4){
                break; 
            }
            else{
                System.out.println("Invalid option; Enter 1 , 2, 3 or 4");
            }
        }
        System.out.println("Goodbye");
        return;
    }

    public static void enterDetails(int index, String[] name, String[] dob, int[] rating){
        String enterName = input("Enter customer name: ");
        String birthdate = input("Enter date of birth: ");
        int creditRating = inputInt("Enter credit rating");
        name[index] = enterName;
        dob[index] = birthdate;
        rating[index] = creditRating;
        return;
    }

    public static void changeRating(int index, String[] name, String[] dob, int[] rating){
        System.out.println("Enter the name of the name of the customer you would like to change the rating of");
        int indexFound = searchPerson(index, name);
        if (indexFound != -1){
            int newRating = inputInt("Enter the new rating:");
            rating[indexFound] = newRating;
        }
        else{
            System.out.println("Customer not found");
        }
        return;
    }
    
    public static int searchPerson(int index, String[] name){
        boolean found = false;
        int indexFound = 0; 
        String enterName = input("Enter name");
        for (int i =0; i< index+1; i++){
            if (name[i].equals(enterName)){
                found = true;
                indexFound = i;
            }
        }
        if (found == false){
            indexFound = -1;
        }
        return indexFound; 
    }

    public static void printRating(int index,String[] name, String[] dob, int[] rating){
        System.out.println("Enter the name of the name of the customer you would like to see the rating for ");
        int indexFound = searchPerson(index, name);
        if (indexFound != -1){
            System.out.println("That customer's rating is " + rating[indexFound]);
        }
        else{
            System.out.println("Customer not found");
        }
    return;
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