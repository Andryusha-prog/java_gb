import java.util.Random;
import java.util.Scanner;

public class homeWork4 {

    public static void main(String[] args) {
        playGame();
    }

    static char[][] createField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++)
                System.out.print(field[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    static void playerInKoord(char[][] field) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        do {
            x = checkInKoord(scanner, 'X');
            y = checkInKoord(scanner, 'Y');
        }
        while (checkFree(field, x, y));
        field[x][y] = 'X';
    }

    static void AIInKoord(char[][] field) {
        int x, y;
        Random rand = new Random();
        do {
            x = rand.nextInt(field.length);
            y = rand.nextInt(field.length);
        }
        while (checkFree(field, x, y));
        field[x][y] = 'O';
    }

    static boolean checkFree(char[][] field, int x, int y) {
        return field[x][y] != '-';
    }

    static int checkInKoord(Scanner scanner, char c) {
        int x;
        do {
            System.out.printf("Введите координату по %s от 1 до 3: %n", c);
            x = scanner.nextInt();
        } while (x < 1 || x > 3);
        return x - 1;
    }

    static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++)
            for (int j = 0; j < field[i].length; j++)
                if (field[i][j] == '-')
                    return false;
        return true;
    }

    static boolean isWin(char[][] field, char ch) {
        for (int i = 0; i < field.length; i++) {
            if ((field[i][0] == ch && field[i][1] == ch && field[i][2] == ch) ||
                    (field[0][i] == ch && field[1][i] == ch && field[2][i] == ch) ||
                    (field[0][0] == ch && field[1][1] == ch && field[2][2] == ch) ||
                    (field[0][2] == ch && field[1][1] == ch && field[2][0] == ch)
            )
                return true;
        }
        return false;
    }

    static boolean doPlayer(char[][] field) {
        playerInKoord(field);
        drawField(field);

        return checkResult(field, 'X');
    }

    static boolean doAI(char[][] field) {
        AIInKoord(field);
        drawField(field);
        return checkResult(field, 'O');
    }

    static boolean checkResult(char[][] field, char user) {
        if (isDraw(field)) {
            System.out.println("Ничья!!!");
            return false;
        }
        if (isWin(field, user)) {
            if (user == 'X')
                System.out.println("Поздравляю! Вы победили!!!");
            else System.out.println("Компьютер выиграл!!!");
            return false;
        }
        return true;
    }

    static void playGame() {
        char[][] field = createField();

        drawField(field);

        while (true) {

            if (!doPlayer(field))
                return;

            if (!doAI(field))
                return;
        }
    }
}
