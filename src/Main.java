import java.util.Scanner;

public class Main {

    static final int countModeQty = 3;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float squareSide = getSquareSide();
        try {
            Figure square = new Figure("square", squareSide);
            Figure circle = new Figure("circle", squareSide / 2);
            getResult(square, circle);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    private static float getSquareSide() {
        System.out.println("Длина стороны квадрата: ");
        return scanner.nextFloat();
    }

    private static void getResult(Figure square, Figure circle) {
        for (int i=1; i<=countModeQty; i++) {
            float FigureArea = FiguresProcessor.countComplexArea(square, circle, i);
            System.out.println(i + " Площадь части фигуры: " + FigureArea);
        }
    }
}
