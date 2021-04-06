package lesson03;

import java.util.Random;
import java.util.Scanner;


public class Lesson03 {

    public static char[][] field;
    public static int fieldSize;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createField() {
        fieldSize = 3;
        field = new char[fieldSize][fieldSize];

        for (int y = 0; y < fieldSize; y++) {
            for (int x = 0; x < fieldSize; x++) {
                field[y][x] = empty;
            }
        }
    }

    public static void viewField() {

        for (int y = 0; y < fieldSize; y++) {
            for (int x = 0; x < fieldSize; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void turnHuman() {
        int cellX;
        int cellY;

        do {
            System.out.println("Введите координаты:");
            cellX = scanner.nextInt() - 1;
            cellY = scanner.nextInt() - 1;
        } while (!validCell(cellY, cellX) || !emptyCell(cellY, cellX));
        field[cellY][cellX] = human;
    }

    public static void turnAI() {
        int cellX;
        int cellY;

        do {
            cellX = random.nextInt(fieldSize);
            cellY = random.nextInt(fieldSize);
        } while (!emptyCell(cellY, cellX));
        field[cellY][cellX] = ai;
    }

    public static boolean checkDiagonal(char player) {
        boolean toRight = true;
        boolean toLeft = true;

        for (int i = 0; i < fieldSize; i++) {
            toRight &= (field[i][i] == player);
            toLeft &= (field[i][fieldSize - i - 1] == player);
        }
        return (toRight || toLeft);
    }

    public static boolean checkLines(char player) {
        boolean cols, rows;

        for (int y = 0; y < fieldSize; y++) {
            rows = true;
            cols = true;
            for (int x = 0; x < fieldSize; x++) {
                rows &= (field[x][y] == player);
                cols &= (field[y][x] == player);
            }
            if (rows || cols) return true;
        }
        return false;
    }

    public static boolean winGame(char player) {
        return (checkDiagonal(player) || checkLines(player));
    }

    public static boolean draw() {
        for (int y = 0; y < fieldSize; y++) {
            for (int x = 0; x < fieldSize; x++) {
                if (field[y][x] == empty) return false;
            }
        }
        return true;
    }

    public static boolean validCell(int cellY, int cellX) {
        return cellX >= 0 && cellX < fieldSize && cellY >= 0 && cellY < fieldSize;
    }

    public static boolean emptyCell(int cellY, int cellX) {
        return field[cellY][cellX] == empty;
    }

    public static void main(String[] args) {

        createField();
        viewField();

        while (true) {

            turnHuman();
            viewField();

            if (winGame(human)) {
                System.out.println("Вы выиграли!");
                break;
            }

            if (draw()) {
                System.out.println("Ничья!");
                break;
            }

            turnAI();
            viewField();

            if (winGame(ai)) {
                System.out.println("Компьютер выиграл!");
                break;
            }

            if (draw()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }
}
