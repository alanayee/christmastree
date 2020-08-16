import java.util.Scanner;
//package Chapter2;
// run javac to compile the java source file    javac numbernine.java
// after that, you can run java file normally
public class christmastree{
    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        System.out.println("Do you want a christmas tree or a tortilla chip? Type c for christmas tree or t for tortilla chip.");
        String type = inputs.nextLine();
        // prevents invalid input for type of shape
        if ((!"c".equals(type)) && (!"t".equals(type))) {
            System.out.println("INVALID. >:(");
            return;
        }
        //to calculate how many rows on the christmas tree & assigns it to a variable
        System.out.println("How many levels do you want your chritmas tree/tortilla chip to be? Please no decimal or negative numbers.");
        int levels = inputs.nextInt();

        // prevents invalid unput for number
        if(levels < 1 ){
            System.out.println("Invalid Input. Try again.");
            return;
        }
        // number of spaces before the * to make it centered
        int ctspaces = levels;
        int spaces = 0;
        int stars = levels;

        //christmas tree
        if(type.equals("c") == true){
            //for loop that determines number of levels (i = # of levels)
            for(int i = 0; i <= levels; i++){
                //for loop to center christmas tree (decreases # of spaces before each row)
                for(int y = ctspaces; y > 0; y--){
                    System.out.print(" ");
                }
                //for loop for the amount of columns, is less than i because row # = # of columns in the row
                for(int x = 1; x <= i; x++){
                    System.out.print("* ");
                }      
            // to make new row
            System.out.println();
            //decreases space each time so that it is centered
            ctspaces -= 1;
        }
        }
        //tortilla chip
        else if(type.equals("t") == true){
            //for loop that determines # of levels/rows( i = # of levels, i++ to increase each time)
            for(int i = 0; i <= levels; i++){
                //for loop to center the tortilla chip(increases # of spaces before each row)
                for(int y = spaces; y>0; y--){
                    System.out.print(" ");
                }
                // for loop for amount of stars in each row
                for(int x = stars; x > 0; x--){
                    System.out.print("* ");
                }
            // to make new row
            System.out.println();
            //to decrease stars each row
            stars -=1;
            //to increase spaces
            spaces +=1;

             } 
        }
    }
}

