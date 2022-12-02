public class Figure {

    public String figureType;
    public float squareSide;
    public float circleRadius;

    public Figure(String figureType, float definingValue) {
        if (definingValue<=0)
            throw new IllegalStateException("Invalid value: " + definingValue);
        this.figureType = figureType;
        switch (figureType) {
            case "square" -> this.squareSide = definingValue;
            case "circle" -> this.circleRadius = definingValue;
            default -> throw new IllegalStateException("Unknown figure type: " + figureType);
        }
    }

    public float getFigureArea(){
        return switch (figureType) {
            case "square" -> squareSide * squareSide;
            case "circle" -> (float) (Math.PI * circleRadius * circleRadius);
            default -> throw new RuntimeException("Unknown Figure");
        };
    }

}
