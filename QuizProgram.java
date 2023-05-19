import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numQuestionsPerSubject = 5; // Number of questions per subject
        int totalQuestions = numQuestionsPerSubject * 3; // Total number of questions
        int score = 0; // To keep track of the user's score

        System.out.println("Welcome to the Quiz Program!");

        // Generate questions for Math subject
        System.out.println("\nMath Questions:");
        score += questions("Math", numQuestionsPerSubject, scanner);

        // Generate questions for Science subject
        System.out.println("\nScience Questions:");
        score += questions("Science", numQuestionsPerSubject, scanner);

        // Generate questions for IT History subject
        System.out.println("\nIT History Questions:");
        score += questions("IT History", numQuestionsPerSubject, scanner);

        // Display the overall result
        System.out.println("\nQuiz complete!");
        System.out.println("Score: " + score + "/" + totalQuestions);
    }

    public static int questions(String subject, int numQuestions, Scanner scanner) {
        int score = 0;

        for (int i = 1; i <= numQuestions; i++) {
            System.out.print("Question " + i + ": ");
            String question = "";
            String correctAnswer = "";

            if (subject.equals("Math")) {
                if (i == 1) {
                    question = "What is 2 + 3?";
                    correctAnswer = "5";
                } else if (i == 2) {
                    question = "What is 7 * 5?";
                    correctAnswer = "35";
                } else if (i == 3) {
                    question = "What is the square root of 25?";
                    correctAnswer = "5";
                } else if (i == 4) {
                    question = "What is 10 - 4?";
                    correctAnswer = "6";
                } else if (i == 5) {
                    question = "What is 12 / 4?";
                    correctAnswer = "3";
                }
            } else if (subject.equals("Science")) {
                if (i == 1) {
                    question = "What is the chemical symbol for water?";
                    correctAnswer = "H2O";
                } else if (i == 2) {
                    question = "What is the largest planet in our solar system?";
                    correctAnswer = "Jupiter";
                } else if (i == 3) {
                    question = "What is the process of plants making food called?";
                    correctAnswer = "Photosynthesis";
                } else if (i == 4) {
                    question = "What is the atomic number of oxygen?";
                    correctAnswer = "8";
                } else if (i == 5) {
                    question = "What is the primary gas that makes up the Earth's atmosphere?";
                    correctAnswer = "Nitrogen";
                }
            } else if (subject.equals("IT History")) {
                if (i == 1) {
                    question = "Who is considered the father of the computer?";
                    correctAnswer = "Alan Turing";
                } else if (i == 2) {
                    question = "Which company developed the first graphical user interface?";
                    correctAnswer = "Xerox";
                } else if (i == 3) {
                    question = "What was the first programming language?";
                    correctAnswer = "Fortran";
                } else if (i == 4) {
                    question = "Who invented the World Wide Web?";
                    correctAnswer = "Tim Berners-Lee";
                } else if (i == 5) {
                    question = "What does CPU stand for?";
                    correctAnswer = "Central Processing Unit";
                }
            }

            System.out.print(question + " ");
            String userAnswer = scanner.nextLine();

            // Check if the answer is correct
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + correctAnswer);
            }
        }

        return score;
    }
}
