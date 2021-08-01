import java.util.Scanner;

public class Manas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int count = 5;
        int marks [] = new int[count];

        // Loop 1:- input
        for(int i=0; i<count; i++){
            System.out.print("Enter the marks of student"+(i+1)+"->");
            marks[i] = input.nextInt();

        }

        //Loop 2:- output
        for(int i=0; i<count; ++i){
            System.out.println("Marks"+(i+1)+"->"+marks[i]);
        }
    }
}
