import java.util.Scanner;
class b2016{
    public static void main(String[] args){
       int size = 10;
       int[] gasBill = new int[size];
       int[] elecBill = new int[size];
       int[] year = new int[size];
       menu(gasBill,elecBill,year);
    }

    public static void menu(int[] gasBill,int[] elecBill,int[] year){
        int choice = -1;
        int index = -1;
        while (choice != 0){
            choice = input("Enter a menu choice \n1)Enter gas and electric bill for one year\n2)Find and show bills for given year\n0)Exit");
            if (choice == 1){
                index = index +1;
                enterData(index,gasBill,elecBill,year);
            }
            else if (choice == 2){
                findBill(index, gasBill,elecBill,year);
            }
            else if (choice == 0){
                break;
            }
            else{
                System.out.println("Can't understand your choice ");
            }
        }
        System.out.println("Bye");
    }

    public static void findBill(int index, int[] gasBill, int[] elecBill, int[] year){
        boolean found = false; 
        int searchYear = input("Enter the year you would like to search the bill for");
        for (int i=0; i <= index; i++){
            if (year[i] == searchYear){
                System.out.println("For " + searchYear + " the bills are: " + "\n" + "Gas : " + gasBill[i] + "\nElectric : " + elecBill[i]);
                found = true;
                break;
            }
        }
        if (found == false){
            System.out.println("That year can not be found");
        }
    }

    public static int enterData(int index, int[] gasBill, int[] elecBill, int[] year){
        if (index == 10){
            System.out.println("Database full");
            index = 0;
            return index; 
        }
        int currentYear = input("Enter the year you would like to record bills for");
        year[index] = currentYear;
        int gasPrice = input("Enter the total gas bill for this year:");
        gasBill[index] = gasPrice;
        int elecPrice = input("Enter the total electric bill for this year");
        elecBill[index] = elecPrice;
        return index;
    }

    public static int input(String m){
        System.out.println(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}