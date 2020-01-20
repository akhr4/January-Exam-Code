//Don't understand what is being asked 

import java.util.Scanner; 
class b2014{
    public static void main(String[] args){
        int size = 10; 
        int[] firstNum = new int[size];
        int[] secondNum = new int[size];
        String[] interest = new String[size];
        int counter = enterNumber(firstNum, secondNum);
        callOfInterest(firstNum,secondNum,interest,counter);
        printall(interest,counter);
        
    }
    public static int enterNumber(int[] firstNum, int[] secondNum){
        int num1= -1;
        int num2 = -1;
        int counter = 0;
        while (num1 != 0){
            num1 = input("Enter first number of next call");
            if (num1 == 0){
                break;
            }
            counter = counter +1;
            num2 = input("Enter second number of this call");
            firstNum[counter] = num1;
            secondNum[counter] = num2;
        }
        return counter;

    }
    public static void callOfInterest(int[] firstNum, int[] secondNum, String[] interest, int counter){
        int call = -1;
        int interestCounter = -1;
        while (call != 0){
            call = input("Enter call of interest");
            if (call == 0){
                break;
            }
            else{
                interestCounter = interestCounter+1;
                for (int i=0; i < counter; i++){
                    if (firstNum[i] == call && ){
                        interest[interestCounter] = call + " " + secondNum[i] + " 1" ;
                        break;
                    }
                    else if(secondNum[i] == call){
                        interest[interestCounter] = firstNum[i] + " " + call + " 2";
                        break;
                    }
                    else{
                        interest[interestCounter] = firstNum[i] + " " + secondNum[i] + " 0";
                    }
                }
            }
        }
    }
    /*
    public static values[] checker(int[] firstNum, int[] secondNum, String[] interest, int counter, int call){
        int callnumber;
        int i = 0;
        for (i=0; i < counter; i++){
            if (firstNum[i] == call){
                callnumber = 1;
            }
            else if(secondNum[i] == call){
                callnumber = 2;
            }
            else{
                callnumber = 0;
            }
        }
        int[] values = {i, callnumber};
        return values;
    } */
    
    public static void printall(String[] interest, int counter){
        for (int i=0; i < counter; i++){
            System.out.println(interest[i]);
        }
    }

    public static int input(String m){
        System.out.println(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
