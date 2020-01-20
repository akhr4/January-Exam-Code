class algorithms{
    public static void main(String[] args){
        int[] numbers = {23,22,45,11,17,91,81,2,4,7};
        int[] a = {432,54,52,24,98,52,12,1,0,2,567,332,454,2,42};
        bubbleSort(numbers);
        System.out.println();
        linearSearch(a, 567);
        linearSearch(numbers, 100);
        System.out.println("Where it isnt found");
        System.out.println(binarySearch(a,98,0,a.length));
        System.out.println("Where it can be found");
        System.out.println(binarySearch(numbers,91,0,numbers.length));
        
    }

    public static void bubbleSort(int[] numbers){
        for (int pass = 0; pass < numbers.length-1; pass++){
            for (int i = 1; i < numbers.length-pass; i++){
                if (numbers[i] < numbers[i-1]){
                    swapNum(numbers,i);
                }
            }
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " "); 
        }
    }

    public static void swapNum(int[] numbers, int i){
        int temp;
        temp = numbers[(i-1)];
        numbers[(i-1)] = numbers[i];
        numbers[i] = temp;
    }

    public static void linearSearch(int[] a, int key){
        int index =-1;
        boolean found = false;
        for (int i=0; i< a.length; i++){
            if (a[i] == key){
                found = true; 
                index = i;
                break;
            }
        }
        if (found == false){
            System.out.println("Item not found");
        }
        else{
            System.out.println(key + " found at index " + index);
        }
    }

    public static int binarySearch(int[] a, int key, int lo, int hi){
        int mid = ((hi + lo) /2);
        if (hi < lo){
            return -1;
        }
        if (a[mid] == key){
            return mid;
        }
        else if (key > a[mid]){
            return binarySearch(a,key,mid+1, hi);
        }
        else{
            return binarySearch(a,key,lo,mid -1);
        }
    }
}