import java.util.Scanner; 
class a2019{
    public static void main(String[] args){
        int size = 15; //Change to 300
        Patient[] patientFile = new Patient[size];
        int active = enterNames(patientFile);
        System.out.println(active);        
        menu(patientFile,active);
    }

    public static int enterNames(Patient[] patientFile){
        String name = " ";
        int active =-1;
        while (!(name.equals("XXX"))){
            name = input("Enter the name of the patient");
            if (name.equals("XXX")){
                break;
            }
            active = active +1;
            Patient p = new Patient();
            patientFile[active] = setName(p ,name);
        }
        return active; 
    }

    public static void menu(Patient[] patientFile, int active){
        int counter = -1; 
        int choice = -1;
        while (choice != 1){
            choice = inputInt("Enter menu choice \n1)Exit \n2)Enter regime \n3)Show all parients");
            if (choice == 1){
                break; 
            }
            else if (choice == 2){
                additionalInfo(patientFile, active);
            }
            else if (choice == 3){
                printAll(patientFile,active);
            }
            else{
                System.out.println("Invalid input. Only enter numbers 1 , 2 or 3 ");
            }
        }
        System.out.println("Goodbye");
    }

    public static void additionalInfo(Patient[] patientFile, int active){
        boolean found = false;
        int index = 0;
        String search = input("Input the name you would like to look for");
        for (int i = 0; i <= active; i++){
            if (getName(patientFile[i]).equals(search)){
                index = i;
                found = true;
                break; 
            }
        }
        if (found == true){
            System.out.println("1)Diet\n2)Exercise\n3)Drugs"); 
            int regime = inputInt("Enter the regime only picking numbers 1 , 2 or 3 ");
            if (regime == 1){
                setRegime(patientFile[index], "Diet");
            }
            else if (regime == 2){
                setRegime(patientFile[index], "Exercise");
            }
            else if (regime ==3){
                setRegime(patientFile[index], "Drugs");
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else{
            System.out.println(search + " can not be found");
        }
    }

    public static void printAll(Patient[] patientFile, int active){
        for (int i =0; i <= active; i++){
            System.out.println("Name: " + getName(patientFile[i]) + " Regime: " + getRegime(patientFile[i]));
        }
    }

    public static String input(String m){
        System.out.println(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int inputInt(String m){
        return Integer.parseInt(input(m));
    }

    public static Patient setName(Patient p, String name){
        p.name = name;
        return p;
    }

    public static Patient setRegime(Patient p, String regime){
        p.regime = regime;
        return p;
    }

    public static String getName(Patient p){
        return p.name;
    }

    public static String getRegime(Patient p){
        return p.regime;
    }
}

class Patient{
    String name; 
    String regime;
}