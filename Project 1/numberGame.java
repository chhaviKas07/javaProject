import java.util.*;

class Numbergame {
    public void guessgame() {
        int random_number = (int)(1 + 100 * Math.random());
        int attempts = 10;     //no of attempts given to user
        int guess_number;   //number guessed by user
        int user_score = 100; //score secured by user
        for (int i = 0; i < attempts; i++) {
            Scanner sc = new Scanner(System.in);
            guess_number = sc.nextInt();
            if (random_number == guess_number) {
                System.out.println("Wow!!!....You guessed it right");
                System.out.println("Score obtained by user is: " + user_score);
                multiplechance();
            } else if (random_number < guess_number && i <= attempts) {
                System.out.println("You guessed Too High!!");
                user_score -= 10;
            } else if (random_number > guess_number && i < attempts) {
                System.out.println("You guessed Too Low!!");
                user_score -= 10;
            }
            if (user_score == 0) {
                System.out.println("You Have completed your 7 attempts");
                System.out.println("The random Number generated was: " + random_number);
                System.out.println("Score obtained by user: " + user_score);
            }
        }

        multiplechance();
    }

    public void multiplechance() {
        Scanner sci = new Scanner(System.in);
        System.out.println("Do you want to play again:(YES/NO)");
        String again = sci.nextLine().toUpperCase(); // Convert to uppercase
        if (again.equals("YES")) {
            System.out.println("You have only 10 Attempts to guess the random number generated");
            System.out.println("Enter the number between 1-100");
            guessgame();
        } else if (again.equals("NO")) {
            System.out.println("Thanks for playing!!!");
        }
    }

    public static void main(String[] args) {
        Numbergame game = new Numbergame();
        System.out.println("Welcome to Number Game!!");
        System.out.println("You have only 10 Attempts to guess the random number generated");
        System.out.println("Enter the number between 1-100");
        game.guessgame();
    }
}
