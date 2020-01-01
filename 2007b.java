import java.util.*;
class b2007{
    public static void main(String[] args){
        int size =4;
        String[] attraction = new String[size];
        String[] postcode = new String[size];
        String toSearch = " ";
        enterall(attraction, postcode);
        while (!(toSearch.equals("exit"))){
            toSearch = input("What attraction do you want to search? Type exit to leave");
            int isFound = locationFinder(attraction,postcode,toSearch);
            if (isFound != -1){
                System.out.println("The postcode for that attraction is " + postcode[isFound]);
            }
            else{
                System.out.println(toSearch + " can not be found");
            }
        }
        System.out.println("Bye");
    }

    public static void enterall(String[] attraction, String[] postcode){
        for (int i =0; i < attraction.length; i ++){
            attraction[i] = input("Enter attraction " + (i+1));
            postcode[i] = input("Enter postcode for " + attraction[i]);
        }
    }
    public static int locationFinder(String[] attraction, String[] postcode, String toSearch){
        for (int i=0; i< attraction.length; i++){
            if (attraction[i].equals(toSearch)){
                return i;
            }
        }
        return -1;
    }
    public static String input(String m){
        System.out.println(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}