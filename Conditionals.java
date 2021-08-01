import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 775963;
        
        if(a%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        input.close();
    }
}
