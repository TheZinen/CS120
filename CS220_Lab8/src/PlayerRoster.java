import java.util.Scanner;
public class PlayerRoster {
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  final int NUM_PLAYERS = 5;
  int[] jerseyNums = new int[NUM_PLAYERS];
  int[] ratingNums = new int[NUM_PLAYERS];
  int i = 0;
  int j = 0;
  int playerJersey = 0;
  int playerRating = 0;
  char menuOption = '-';
  // Get user defined jersey numbers and ratings
  for (i = 0; i < NUM_PLAYERS; ++i)
  {
   System.out.print("Enter player " + (i + 1) + "'s jersey number: ");
   // LAB8: Save into the jerseyNums array in the right place
   jerseyNums[i] = scan.nextInt();
   System.out.print("\nEnter player " + (i + 1) + "'s rating: ");
   // LAB8: Save into the ratingNums array in the right place
   ratingNums[i] = scan.nextInt();
   System.out.println("\n");
  }
  // Print roster
  System.out.println("\nROSTER");
  for (i = 0; i < NUM_PLAYERS; ++i)
  {
   // LAB8: Print out player i from the jerseyNums array
   // in following format: "Player 1 -- Jersey number: 84, Rating: 7"
   System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + ratingNums[i]);
  }
  // Menu
  do
  {
   System.out.println("\nMENU");
   System.out.println("u - Update player rating");
   System.out.println("a - Output players above a rating");
   System.out.println("r - Replace player");
   System.out.println("o - Output roster");
   System.out.println("q - Quit");
   System.out.print("\nChoose an option: ");
   menuOption = scan.next().charAt(0);
   System.out.println("");
   // Respond to menu option choice
   if (menuOption == 'u') // Update
   {
    System.out.println("Enter a jersey number: ");
    playerJersey = scan.nextInt();
    System.out.println("Enter a new rating for player: ");
    playerRating  = scan.nextInt();
    // LAB8: Search the jerseyNums array for the player with playerJersey
    // and update his rating based on the input playerRating
    for (i = 0; i < NUM_PLAYERS; ++i) {
     if (playerJersey == jerseyNums[i]) {
      ratingNums[i] = playerRating;
     }
    }
   }
   else if (menuOption == 'a') // Output players above a user defined rating
   {
    System.out.println("Enter a rating: ");
    playerRating = scan.nextInt();
    System.out.println("ABOVE " + playerRating);
    // LAB8: Iterate through the ratingNum array and print out all players
    // whose rating is above playerRating in following form: "Player 1 -- Jersey number: 84, Rating: 7"
    for (i = 0; i < NUM_PLAYERS; ++i) {
     if (ratingNums[i] > playerRating) {
      System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + ratingNums[i]);
     }    
    }
   }
   else if (menuOption == 'r') // Replace
   {
    System.out.println("Enter a jersey number: ");
    playerJersey = scan.nextInt();
    
    for (i = 0; i < NUM_PLAYERS; ++i) {
     if (jerseyNums[i] == playerJersey) {
      System.out.println("Enter a new jersey number: ");
      jerseyNums[i] = scan.nextInt();
      System.out.println("Enter a rating for the new player: ");
      ratingNums[i] = scan.nextInt();
     }    
    }
    j = -1;  // Default index for player replacement
    // LAB8: Search for the index (save in j) of the player with playerJersey
    
    // Replace player only if the player is in the roster
    if (j != -1)
    {         
     System.out.println("Enter a new jersey number: ");
     playerJersey = scan.nextInt();
     System.out.println("Enter a rating for the new player: ");
     playerRating  = scan.nextInt();
     // LAB8: Update jerseyNums and ratingNums arrays according to 
     // the new playerJersey and playerRating just input from the user
    }
   }
   else if (menuOption == 'o') // Output roster
   {
    System.out.println("ROSTER");
    for (i = 0; i < NUM_PLAYERS; ++i)
    {
     // LAB8: Print out player i from the jerseyNums array
     // in following format: "Player 1 -- Jersey number: 84, Rating: 7"
     System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + ratingNums[i]);
    }
    // LAB8: Output all players (similar/equivalent to how you did it right
    // before the DO-WHILE loop when you first output all the players. Use
    // same form: "Player 1 -- Jersey number: 84, Rating: 7"
   }
  } while(menuOption != 'q');
  return;
 }
}