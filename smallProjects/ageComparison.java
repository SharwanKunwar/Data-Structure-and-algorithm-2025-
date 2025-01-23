package smallProjects;

import java.util.Scanner;

public class ageComparison {
    public static void main(String[] args)
    {
        //Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter age01 : ");
        int age01 = scan.nextInt();
        System.out.print("Enter age02 : ");
        int age02 = scan.nextInt();
        System.out.print("Enter age03 : ");
        int age03 = scan.nextInt();

        int person01 = 2081-age01;
        int person02 = 2081-age02;
        int person03 = 2081-age03;




        if(person01 > person02 && person01 > person03){
            System.out.println("age01 is elder. and Age: "+person01);
        }else if(person02 > person01 && person02 > person03){
            System.out.println("age02 is elder. and Age: "+person02);
        }else if(person03 > person01 && person03 > person02){
            System.out.println("age03 is elder. and Age: "+person03);
        }else{
            System.out.println("same age : "+person01);
        }

    }
}
