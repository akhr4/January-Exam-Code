import java.util.*;
class b2011{
    public static void main(String[] args){
        //Making arrays 
        int nominations = 5;
        String[] name = new String[nominations];
        int[] votecounts = new int[nominations];
        int judges = 16;
        int[] prevoted = new int[judges];
        //Preset all values
        preset(votecounts, prevoted); 
        //Method to enter nominated films
        enter(name);
        //While the judges have not voted, keep asking for judge number and their vote
        for (int i =0; i<prevoted.length; i++){
            while (prevoted[i] < 0){ 
                voting(name, votecounts, prevoted);
            }
        }
        winner(name, votecounts); //Counts who is the winnner
    }

    //Set all values to -1 to check who has voted
    public static void preset(int[] votecounts, int[] prevoted){
        for (int i =0; i< prevoted.length; i++){
            prevoted[i] = -1;
        }
        for (int i =0; i< votecounts.length; i++){
            votecounts[i] = 0;
        }

    }

    //Method to enter film names
    public static void enter(String[] name){
        for (int i=0; i< name.length; i++){
            name[i] = input("Enter the name of nominated film " + (i+1));
        }
    }

    public static void voting (String[] name, int[] votecounts, int[] prevoted){
        int judgenumber = inputInt("Enter your judging number: ");
        if (prevoted[(judgenumber -1)] == 1){ 
            System.out.println("You have already voted");
        }
        else{
            displaymovies(name);
            int movievote = inputInt("Enter the number of the movie you would like to vote for:");
            votecounts[movievote-1] = votecounts[movievote-1] + 1; //Increments the amount of votes for chosen movie 
            prevoted[(judgenumber-1)] = 1; //Sets the val to 1 in prevoted to signify judge has cast vote
        }       
               

    }

    //Shows all nominated movies
    public static void displaymovies(String[] name){
        for (int i=0; i< name.length; i++){
            System.out.println ("Enter " + (i+1) + " for " + name[i]);
        }
    }
    //Finds out who has the most votes
    public static void winner(String[] name, int[] votecounts){
        int greatest = 0; 
        int best = 0; 
        for (int i=1; i< votecounts.length ; i++){
            if (votecounts[i] > votecounts[i-1]){
                greatest = votecounts[i];
                best = i;
            }
        }
        String winner = name[best];
        System.out.println("The winner is " + winner + " scoring " + greatest + " votes.");
        
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