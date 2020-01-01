import java.util.Scanner;
class b2012{
    public static void main(String[] args){
        int size = 16;
        String[] celebrity = new String[size];
        addNAMES(celebrity);
        int[] judge1 = new int[size];
        int[] judge2 = new int[size];
        int[] judge3 = new int[size];
        int[] total = new int[size];
        addSCORES(celebrity,judge1,judge2,judge3,total);
        sort(celebrity,judge1,judge2,judge3,total);
        showTABLE(celebrity, judge1,judge2,judge3,total);
    }

    public static void addNAMES(String[] celebrity){
        for (int i=0; i< celebrity.length; i++){
            celebrity[i] = input("Enter the name of celebrity " + (i+1));
        }
    }

    public static void addSCORES(String[] celebrity, int[] judge1, int[] judge2, int[] judge3, int[] total){
        for (int i = 0; i<celebrity.length; i++){
            judge1[i] = inputInt("Judge 1, Enter the score for " + celebrity[i]);
            judge2[i] = inputInt("Judge 2, Enter the score for " + celebrity[i]);
            judge3[i] = inputInt("Judge 3, Enter the score for " + celebrity[i]);
            total[i] = judge1[i] + judge2[i] + judge3[i];
        }
        return;
    }


    static void sort(String[] celebrity, int[] judge1, int[] judge2, int[] judge3, int[] total){  
		int n = celebrity.length;  
		int temp = 0;  
		for(int i=0; i < n; i++){ 
			for(int j=1; j < (n-i); j++){
                if(total[j-1] < total[j]){   
                    swapString(celebrity, j);
                    swapInt(total, j);
                    swapInt(judge1, j);
                    swapInt(judge2, j);
                    swapInt(judge3, j);
				}
			}  
		}  
 
	} 
    
    public static void swapString(String[] celebrity, int i){
        String temp;
        temp = celebrity[(i-1)];
        celebrity[(i-1)] = celebrity[i];
        celebrity[i] = temp;
    }

    public static void swapInt(int[] scores, int i){
        int temp;
        temp = scores[(i-1)];
        scores[(i-1)] = scores[i];
        scores[i] = temp;
    }

    public static void showTABLE(String[] celebrity, int[] judge1, int[] judge2, int[] judge3, int[] total){
        for (int i=0; i < celebrity.length; i++){
            System.out.println(celebrity[i] + " scored " + total[i]);
            System.out.println("Score 1: " + judge1[i] + "\nScore 2: " + judge2[i] + "\nScore 3: " + judge3[i]);
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