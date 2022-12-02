public class FiguresProcessor {

    public static float countComplexArea(Figure fig1, Figure fig2, int mode) {
        float area1 = fig1.getFigureArea();
        float area2 = fig2.getFigureArea();
        return switch (mode) {
            case 1 -> (area1 - area2) / 2;
            case 2 -> (area1 - area2) / 2 + area2;
            case 3 -> (area1 - area2) / 4 + area1 / 4;
            default -> throw new IllegalStateException("Count mode does not exist");
        };
    }
}
