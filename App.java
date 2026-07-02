//

import java.util.Locale.Category;
import java.util.Scanner;

public class App {

    public enum Categories{ //enum for all the categories in yahtzee
        PAIR, TOAK, FOAK, FULL, CHANCE, SMALL, YAHTZEE 
    }

    public static int Roll (int sides){ //method to roll a dice

        int diceValue = (int)(Math.random()*sides + 1); //chooses a random number, times it by the number of sides, and add 1, to simulate a regular dice being rolled, and only gving number between 1-6
        return diceValue;
    }

    public static int pair(int d1, int d2, int d3, int d4, int d5){ //method to check if there is a pair of the same dices out of the 5 dices 
        
        if ((d1 == d2) || (d1 == d3) || (d1 == d4) || (d1 == d5) || (d2 == d3) || (d2 == d4) || (d2 == d5) || (d3 == d4) || (d3 == d5) || (d4 == d5)){
            return 5; // checks all combinations and checks if any of them are pair, if yes, then returns 5, which is how many points they earn for a pair
        }
        else{ //if no pairs are present
            return 0; //returns 0, so the user gets 0 points
        }
    }

    public static int threeOfaKind(int d1, int d2, int d3, int d4, int d5){ //method to check if any of 3 of the 5 dices, are the same
        //goes through all the three dice combinations five dice can form, and checks if they are all the same
        if ((d1 == d2 && d1 == d3) || (d1 == d2 && d1 == d4) || (d1 == d2 && d1 == d5) || (d1 == d3 && d1 == d4) || (d1 == d3 && d1 == d5) || (d1 == d4 && d1 == d5) || (d2 == d3 && d2 == d4) || (d2 == d3 && d2 == d5) || (d2 == d4 && d2 == d5) || (d3 == d4 && d3 == d5)){
            return 10; //if yes, then gives the user 10 points
        }
        else{ //otherwise, gives them 0
            return 0;
        }

    }

    public static int fourOfaKind(int d1, int d2, int d3, int d4, int d5){ //checks if any of the 5 dices, have 4 of the same value

        //goes through all four dice combinations five dice can form, and checks if all four are the same
        if ((d1 == d2 && d1 == d3  && d1 == d4) || (d1 == d2 && d1 == d3  && d1 == d5) || (d1 == d2 && d1 == d4  && d1 == d5) || (d1 == d3 && d1 == d4  && d1 == d5) || (d2 == d3 && d2 == d4  && d2 == d5)){
            return 15; //if they are all the same, gives user 15 points
        }
        else{ //otherwise 0
            return 0;
        }

    }

    public static int fullHouse(int d1, int d2, int d3, int d4, int d5) { //method to check for a full house, which is if there is one pair, and one three of a kind
        //variables to count how many times each die value appears 

        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
    
        // Check d1
        if (d1 == 1) one++;
        if (d1 == 2) two++;
        if (d1 == 3) three++;
        if (d1 == 4) four++;
        if (d1 == 5) five++;
        if (d1 == 6) six++;
    
        // Check d2
        if (d2 == 1) one++;
        if (d2 == 2) two++;
        if (d2 == 3) three++;
        if (d2 == 4) four++;
        if (d2 == 5) five++;
        if (d2 == 6) six++;
    
        // Check d3
        if (d3 == 1) one++;
        if (d3 == 2) two++;
        if (d3 == 3) three++;
        if (d3 == 4) four++;
        if (d3 == 5) five++;
        if (d3 == 6) six++;
    
        // Check d4
        if (d4 == 1) one++;
        if (d4 == 2) two++;
        if (d4 == 3) three++;
        if (d4 == 4) four++;
        if (d4 == 5) five++;
        if (d4 == 6) six++;
    
        // Check d5
        if (d5 == 1) one++;
        if (d5 == 2) two++;
        if (d5 == 3) three++;
        if (d5 == 4) four++;
        if (d5 == 5) five++;
        if (d5 == 6) six++;
    
        //Goes through each of the counter to see if any matches a full house, which will be when there is a pair and a three of a kind 
        if ((one == 3 || two == 3 || three == 3 || four == 3 || five == 3 || six == 3) && (one == 2 || two == 2 || three == 2 || four == 2 || five == 2 || six == 2)) {
            return 20; //So if any of the counter is 3, and any of the counter is 2, then it will match the full house, and give user 25 points
        }
    
        return 0; //otherwise, it will give the user 0
    } 

    public static int smallStraight(int d1, int d2, int d3, int d4, int d5){ //method to check for a small straight, which is if there are numbers that appear in a row, like 1,2,3,4 or 2,3,4,5
        //variables to count how many times each die value appears
        int one = 0; 
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
    
        // Check d1
        if (d1 == 1) one++;
        if (d1 == 2) two++;
        if (d1 == 3) three++;
        if (d1 == 4) four++;
        if (d1 == 5) five++;
        if (d1 == 6) six++;
    
        // Check d2
        if (d2 == 1) one++;
        if (d2 == 2) two++;
        if (d2 == 3) three++;
        if (d2 == 4) four++;
        if (d2 == 5) five++;
        if (d2 == 6) six++;
    
        // Check d3
        if (d3 == 1) one++;
        if (d3 == 2) two++;
        if (d3 == 3) three++;
        if (d3 == 4) four++;
        if (d3 == 5) five++;
        if (d3 == 6) six++;
    
        // Check d4
        if (d4 == 1) one++;
        if (d4 == 2) two++;
        if (d4 == 3) three++;
        if (d4 == 4) four++;
        if (d4 == 5) five++;
        if (d4 == 6) six++;
    
        // Check d5
        if (d5 == 1) one++;
        if (d5 == 2) two++;
        if (d5 == 3) three++;
        if (d5 == 4) four++;
        if (d5 == 5) five++;
        if (d5 == 6) six++;

        //does not care about order of the dice
        if ((one > 0) && (two > 0) && (three > 0) && (four > 0) || (two > 0) && (three > 0) && (four > 0) && (five > 0) || (three > 0) && (four > 0) && (five > 0) && (six > 0)){
            return 25;//If 1,2,3,4 appear, or 2,3,4,5 appear, or 3,4,5,6 appear, then user get 25 points
        }
        else{
            return 0;
        }
    }

    public static int chance(int d1, int d2, int d3, int d4, int d5){ //method to calculate the sum of the dice,
        return d1 + d2 + d3 + d4 + d5;//which will be how many points the user gets
    }

    public static int yahtzee(int d1, int d2, int d3, int d4, int d5){ //method to check if the user gets the same value on each of the five dice.
        if ((d1 == d2) && (d1 == d3) && (d1 == d4) && (d1 == d5)){
            return 50; //if yes, gives them 50 points
        }
        else{
            return 0;
        }
    }


    public static int tryParse(){ //method that asks the user for a valid input, while also checking for errors so the code doesn't crash, and also asking again for an invalid input.
        Scanner sC = new Scanner(System.in); //a scanner object to read input from anything the user enters
        String line = ""; //this will be where the input after it is parsed into a double will be held.
        int input; //variable to store the input, which will then be parsed to an int.
        
        while (true){ //until the user enters a valid input
            try{
                line = sC.nextLine(); //asks the user for an input
                input = Integer.parseInt(line); //parses line into an int
                break; //breaks if no exceptions are raised, meaning an integer was inputted
            }catch(NumberFormatException e){ //if exception is raised, an integer was not inputted
                System.out.println("Not a valid integer. Please try again"); //asks the user again
            }
        }
        return input; //returns the input
    }

    public static void main(String[] args) throws Exception {
        
        Scanner sC = new Scanner(System.in); 
        int points = 0; //variable to store the amount of points the user earns

        //calls the Roll method
        int d1 = Roll(6);
        int d2 = Roll(6);
        int d3 = Roll(6);
        int d4 = Roll(6);
        int d5 = Roll(6);

        System.out.printf("you rolled . . . %d, %d, %d, %d, %d%n", d1, d2, d3, d4, d5); //outputs the values the user rolled

        //menu printed in a nice formatted way, alongside the points the user can earn
        System.out.println("Select a number from the following menu:");
        System.out.printf("%-5d%-20s%15d points%n", 1, "PAIRS", 5);
        System.out.printf("%-5d%-20s%15d points%n", 2, "THREE OF A KIND", 10);
        System.out.printf("%-5d%-20s%15d points%n", 3, "FOUR OF A KIND", 15);
        System.out.printf("%-5d%-20s%15d points%n", 4, "FULL HOUSE", 20);
        System.out.printf("%-5d%-20s%15d points%n", 5, "SMALL STRAIGHT", 25);
        System.out.printf("%-5d%-20s%22s %n", 6, "CHANCE", "Sum of Dice");
        System.out.printf("%-5d%-20s%15d points%n", 7, "YAHTZEE!", 50);

        
        int choice = 0; //variable for the choice

        //error checks to see if the choice is a number
        while (true){
            choice = tryParse(); //uses tryParse method
            if (choice > 7){ //also checks if the choice is greater than 7, as only input between 1 and 7 can be taken
                System.out.println("Invalid Number, Please Choose A Number From the List"); //if greater then asks the user again
            }
            else{ //if not greater then breaks
                break;
            }
        }

        Categories menuChoice;

        if (choice ==1){
            menuChoice = Categories.PAIR;
        }
        else if(choice == 2){
            menuChoice = Categories.TOAK;
        }
        else if(choice == 3){
            menuChoice = Categories.FOAK;
        }
        else if(choice == 4){
            menuChoice = Categories.FULL;
        }
        else if(choice == 5){
            menuChoice = Categories.SMALL;
        }
        else if(choice == 6){
            menuChoice = Categories.CHANCE;
        }
        else{
            menuChoice = Categories.YAHTZEE;
        }

        switch (menuChoice) {
            case PAIR:
                points = pair(d1, d2, d3, d4, d5);
                break;
            case TOAK:
                points = threeOfaKind(d1, d2, d3, d4, d5);
                break;
            case FOAK:
                points = fourOfaKind(d1, d2, d3, d4, d5);
                break;
            case FULL:
                points = fullHouse(d1, d2, d3, d4, d5);
                break;
            case SMALL:
                points = smallStraight(d1, d2, d3, d4, d5);
                break;
            case CHANCE:
                points = chance(d1, d2, d3, d4, d5);
                break;
            case YAHTZEE:
                points = yahtzee(d1, d2, d3, d4, d5);
                break;
            }

        System.out.printf("You got %d points for your pick!", points);

    }
}