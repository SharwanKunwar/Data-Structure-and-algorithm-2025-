package If_else_conditionals;

import java.util.Scanner;

public class Area_and_Perimeter {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Rectangle length : ");
        int length = scan.nextInt();
        System.out.print("Enter your Rectangle breadth : ");
        int breadth = scan.nextInt();

        int Rectangle_area = length*breadth;
        int Rectangle_perimeter = 2*(length+breadth);

        if(Rectangle_area > Rectangle_perimeter){
            System.out.println("\nAccording to given length and breadth of rectangle.\nArea is greater then perimeter.\n");
            System.out.format("\tArea: %d\nPerimeter: %d\n",Rectangle_area,Rectangle_perimeter);
        }else if(Rectangle_area < Rectangle_perimeter){
            System.out.println("\nAccording to given length and breadth of rectangle.\nArea is less then perimeter.\n");
            System.out.format(" \t Area : %d\nPerimeter : %d\n",Rectangle_area,Rectangle_perimeter);
        }else{
            System.out.println("\nArea and perimeter are equal\n");
        }

    }
}
