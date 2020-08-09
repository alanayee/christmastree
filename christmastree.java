import java.util.Scanner;
//package Chapter2;
// run javac to compile the java source file    javac numbernine.java
// after that, you can run java file normally
public class christmastree{
    public static void main(String[] args) {
        // System.out.println("    xxxxx   ");
        // System.out.println("  x      x ");
        // System.out.println(" ((  o  o  )) ");
        // System.out.println("  |   V   |");
        // System.out.println("  |  ===  |");
        // System.out.println("  _________");

        Scanner inputs = new Scanner(System.in);
        //to calculate how many rows on the christmas tree & assigns it to a variable
        System.out.println("How many levels do you want your chritmas tree to be? Please no decimal or negative numbers.");
        int levels = inputs.nextInt();
        // number of spaces before the * to make it centered
        int spaces = levels;

        if(levels < 1){
            System.out.println("Invalid Input. Try again.");
            return;
        }

        //for loop that determines number of levels (i = # of levels)
        for(int i = 0; i <= levels; i++){
            //for loop to center christmas tree (decreases # of spaces before each row)
            for(int y = spaces; y > 0; y--){
                System.out.print(" ");
            }
            //for loop for the amount of columns, is less than i because row # = # of columns in the row
            for(int x = 1; x <= i; x++){
                System.out.print("* ");
            }      
        // to make new row
        System.out.println();
        //decreases space each time so that it is centered
        spaces -= 1;
        }
    }
}


