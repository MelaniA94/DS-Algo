import java.util.Arrays;
import java.util.Scanner;

public class Array_Reverse {

        public static void main(String[] args) {
            System.out.println("Enter the number of Elements");
            Scanner sc = new Scanner(System.in);
            int Length = sc.nextInt();
            int Array[] = new int[Length];
            System.out.println("enter the Elements");
            for(int i=0;i<Length;i++){
                Array[i]=sc.nextInt();
            }
            //int NewArray[] = new int[Length];
            for(int i=0;i<=(Array.length)/2;i++){
                int temp=Array[i];
                Array[i]=Array[Array.length-i-1]; // Array indexes is less than 1 in size
                Array[Array.length-i-1]=temp;
            }

            System.out.println(Arrays.toString(Array));
        }
    }


