import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        char triangleChar;
        int n;

        System.out.println("What character would you like to use to construct your pyramid?");

        triangleChar = scnr.next().charAt(0);

        System.out.println("Enter height of pyramid:");

        n = scnr.nextInt();
       

        scnr.close();

        for (int i = 1; i < n + 1; i++){
            for (int j = 0; j < i; j++){
                System.out.print(triangleChar + " ");
            }
            System.out.println();
        }
    }
}
