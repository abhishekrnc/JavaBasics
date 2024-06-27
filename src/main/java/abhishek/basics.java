package abhishek;

public class basics {

    public static void main(String[] args) {

        //Arrays
    //1st way
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

    //2nd way
        int[] arr2 = {1, 2, 4, 5, 6};
        System.out.println(arr2[3]);

        //for loop
        for(int i =0; i<arr.length; i++)   //print 1,2,4,5,6
        {
           System.out.println(arr[i]);
        }

        //For Loop with Array
        String[] name = {"Abhishek", "Rahul", "Ankit", "Anish", "Ram"};
        for(int i=0;i<name.length; i++) {
            System.out.println(name[i]);
        }

    }
}
