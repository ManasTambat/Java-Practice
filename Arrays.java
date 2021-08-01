import java.util.Scanner;

/**
 * Arrays
 * arr [  _ ,    _ ,    _     ]
 *        0      1      2
 */
public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        int[] marks = new int[5];

        System.out.print("\nEnter Marks 1 : ");
        marks[0] = input.nextInt();
        System.out.print("\nEnter Marks 2 : ");
        marks[1] = input.nextInt();
        System.out.print("\nEnter Marks 3 : ");
        marks[2] = input.nextInt();
        System.out.print("\nEnter Marks 4 : ");
        marks[3] = input.nextInt();
        System.out.print("\nEnter Marks 5 : ");
        marks[4] = input.nextInt();
        

        System.out.println("\nMarks 1 : " + marks[0]);
        System.out.println("\nMarks 2 : " + marks[1]);
        System.out.println("\nMarks 3 : " + marks[2]);
        System.out.println("\nMarks 4 : " + marks[3]);
        System.out.println("\nMarks 5 : " + marks[4]);
        */

        int count = 5;
        int[] marks = new int[count];

        // input loop
        for(int i=0; i<count; i++){
            System.out.print("Enter Marks "+(i+1)+" : ");
            marks[i] = input.nextInt();
        }
        System.out.println("--------------");
        // output loop
        for(int i=0; i<count; i++){
            System.out.println("Marks "+(i+1)+" : " + marks[i]);
        }
    }
}