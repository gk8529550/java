import java.util.Scanner;

public class kbcgame1 {
    public static final String[] QUESTIONS = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'To Kill a Mockingbird'?",
            "Which is the largest mammal?",
            "What is the chemical symbol for water?"
    };

    public static final String[] OPTIONS = {
            "A) London     B) Paris     C) Rome     D) Berlin",
            "A) Venus      B) Mars      C) Jupiter  D) Saturn",
            "A) Harper Lee B) J.K. Rowling C) George Orwell D) Jane Austen",
            "A) Elephant   B) Blue Whale C) Giraffe  D) Hippopotamus",
            "A) Wo        B) H2O       C) Co       D) H2SO4"
    };

    public static final char[] ANSWERS = {'B', 'B', 'A', 'B', 'B'};
    public static final int PRIZE_MONEY = 10000;

    public static int currentQuestionIndex = 0;
    public static int totalPrizeMoney = 0;
    public static boolean isGameOver = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!isGameOver) {
            System.out.println("Question " + (currentQuestionIndex + 1) + ":");
            System.out.println(QUESTIONS[currentQuestionIndex]);
            System.out.println(OPTIONS[currentQuestionIndex]);
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            if (userAnswer == ANSWERS[currentQuestionIndex]) {
                totalPrizeMoney += PRIZE_MONEY;
                System.out.println("Correct Answer! You won $" + PRIZE_MONEY);
                currentQuestionIndex++;
                if (currentQuestionIndex >= QUESTIONS.length) {
                    System.out.println("Congratulations! You have won the game. Total prize money: $" + totalPrizeMoney);
                    isGameOver = true;
                } else {
                    System.out.println("Next Question...");
                }
            } else {
                System.out.println("Wrong Answer! Game Over!");
                System.out.println("Total prize money: $" + totalPrizeMoney);
                isGameOver = true;
            }
        }
        scanner.close();
    }
}
