package org.example;

public record CartesianCoordinate(double x, double y){
    public double getDistanceFromOriginPoint(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public String getPosition(){
        return switch(String.format("(%s, %s)", Integer.signum((int)this.x), Integer.signum((int)this.y))){
            case "(0, 0)" -> "origin point";
            case "(0, 1)", "(0, -1)" -> "x-axis";
            case "(1, 0)", "(-1, 0)" -> "y-axis";
            case "(1, 1)" -> "Quadrant I";
            case "(-1, 1)" -> "Quadrant II";
            case "(-1, -1)" -> "Quadrant III";
            case "(1, -1)" -> "Quadrant IV";
            default -> "unknown";
        };
    }

    @Override
    public String toString(){
        return String.format("(%s, %s)", this.x, this.y);
    }
}