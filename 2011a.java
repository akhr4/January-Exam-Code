///Using Records - Can be done without!! a
import java.util.Scanner;
class a2011{
    public static void main(String[] args){
        film harryp = new film();
        harryp.filmName = "Harry Potter";
        harryp.character1 = "Harry";
        harryp.actor1 = "Daniel Radcliff";
        harryp.character2 = "Hermione";
        harryp.actor2 = "Emma Watson";
        film twilight = new film();
        twilight.filmName = "Twilight";
        twilight.character1 = "Edward";
        twilight.actor1 = "Robert Pattinson";
        twilight.character2 = "Bella";
        twilight.actor2 = "Kristen Stewart";
        String filmSeries = input("Film series?");
        boolean exist = true;
        while (exist){
            if (filmSeries.equals(harryp.filmName)){
                harryPotterFilm(harryp, exist); 
            }
            else if (filmSeries.equals(twilight.filmName)){
                twilightFilm(twilight,exist); 
            }
            else{
                exist = false;
                break;
            }
            filmSeries = input("Film Series?");
        }
        if (exist == false){
            System.out.println("I will return");
        }
    }

    public static boolean harryPotterFilm(film harryp, boolean exist){
        String character = input("Character?");
        if (character.equals(harryp.character1)){
            System.out.println(harryp.actor1 + " plays Harry in the " + harryp.filmName + " series");
        }
        else if (character.equals(harryp.character2)){
            System.out.println(harryp.actor2 + " plays Hermione in the " + harryp.filmName + " series");
        }
        else {
            exist = false;

        }
        return exist;
    }

    public static boolean twilightFilm(film twilight, boolean exist){
        String character = input("Character?");
        if (character.equals(twilight.character1)){
            System.out.println(twilight.actor1 + " plays Edward in the " + twilight.filmName + " series");
        }
        else if (character.equals(twilight.character2)){
            System.out.println(twilight.actor2 + " plays Bella in the " + twilight.filmName + " series");
        }
        else {
            exist = false;
        }
        return exist;
    }

    public static String input(String m){
        System.out.println(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
class film{
    String filmName;
    String character1;
    String actor1;
    String character2;
    String actor2;
}