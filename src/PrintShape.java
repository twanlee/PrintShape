import java.util.Scanner;

public class PrintShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        String a = "*";
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (true){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    for( i=0; i<4;i++){
                        System.out.println("********");
                    }
                    break;
                case 2:
                    for (i=0; i<5; i++){
                        a = a + "*";
                        System.out.println(a);
                    }
                    break;
                case 3:
                    for(i=1;i<=5;i++)
                    {
                        for(j=i;j<=5;j++)
                        {
                            System.out.print(" ");
                        }
                        for(j=1;j<=i;j++)
                        {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
