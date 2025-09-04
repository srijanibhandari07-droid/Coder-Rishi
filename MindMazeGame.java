import java.util.*;

public class MindMazeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Maze size (3x3 grid, path length 4)
        int pathLength = 4;
        String[] directions = {"UP", "DOWN", "LEFT", "RIGHT"};
        String[] secretPath = new String[pathLength];

        // Generate random path
        for (int i = 0; i < pathLength; i++) {
            secretPath[i] = directions[rand.nextInt(directions.length)];
        }

        System.out.println("=== Welcome to MIND MAZE ===");
        System.out.println("Find the secret path of " + pathLength + " moves!");
        System.out.println("Valid moves: UP, DOWN, LEFT, RIGHT");
        System.out.println("One wrong move and you lose!\n");

        boolean lost = false;
        for (int i = 0; i < pathLength; i++) {
            System.out.print("Enter move " + (i + 1) + ": ");
            String move = sc.next().toUpperCase();

            if (!move.equals(secretPath[i])) {
                System.out.println("❌ Wrong move! The path was " + secretPath[i]);
                lost = true;
                break;
            } else {
                System.out.println("✔ Correct!");
            }
        }

        if (!lost) {
            System.out.println("\n🎉 Congratulations! You escaped the Mind Maze!");
        } else {
            System.out.println("\n💀 Game Over! Better luck next time.");
        }
    }
}