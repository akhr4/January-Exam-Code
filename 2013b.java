import java.util.Scanner; 
class b2013{
    public static void main(String[] args){
        int students = 5; 
        int[] ID = new int[students];
        String[] grade1 = new String[students];
        String[] grade2 = new String[students];
        String[] grade3 = new String[students];
        String[] grade4 = new String[students];
        String[] average = new String[students];
        int counter = enterGrade(ID, grade1,grade2,grade3,grade4,average);
        computeFINALGRADES(grade1,grade2,grade3,grade4,average,counter);
        printAll(ID, grade1,grade2,grade3,grade4,average,counter);
    }
    public static int enterGrade(int[] ID, String[] grade1, String[]grade2, String[] grade3, String[] grade4, String[] average){
        int IDname= -1;
        int counter = -1;
        while (IDname != 0 || counter == (ID.length-1)){
            if (IDname == 0 || counter == (ID.length-1)){
                break;
            }
            else{
                counter = counter +1;
            }
            IDname = inputInt("Enter student ID");
            ID[counter] = IDname;
            grade1[counter] = input("Enter student grade 1");
            grade2[counter] = input("Enter student grade 2");
            grade3[counter] = input("Enter student grade 3");
            grade4[counter] = input("Enter student grade 4");

        }
        return (counter+1);
    }

  
    public static int countGRADES(String g, String [] grades) {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].compareTo(g) <= 0){
                count = count + 1;
            }
        }
        return count;
    }

    public static void computeFINALGRADES(String[] grade1, String[] grade2, String[] grade3, String[] grade4, String[] average, int counter){
        for (int i = 0; i < counter; i++) {
            String [] grades = {grade1[i],grade2[i],grade3[i],grade4[i]}; 
            average[i] = computeGRADE(grades);
        } 
    }

    public static String computeGRADE(String [] grades) {
        if (countGRADES("A", grades) >=3){
            return "A";
        }
        else if (countGRADES("B", grades) >=3){
            return "B";
        }
        else if (countGRADES("C", grades) >=3){
            return "C";
        }
        else if (countGRADES("D", grades) >=3){
            return "D";
        }
        else if (countGRADES("E", grades) >=3){
            return "E";
        }
        else{
            return "F";
        }
    }
    
    public static void printAll(int[] ID, String[] grade1, String[] grade2, String[] grade3, String[] grade4, String[] average, int counter){
        for (int i=0; i< counter; i++){
            System.out.println("Student ID: " + ID[i] + "\nGrade 1 " + grade1[i] + "\nGrade 2 " + grade2[i]+ "\nGrade 3 " + grade3[i]+ "\nGrade 4 " + grade4[i]+ "\nAverage Grade  " + average[i]);
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
}
