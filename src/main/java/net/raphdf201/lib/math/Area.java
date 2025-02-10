package net.raphdf201.lib.math;

public class Area {
    public static double getPrismArea(double basePerimeter, double height, double baseArea) {
        return basePerimeter * height + 2 * baseArea;
    }

    public static double getCubeArea(double side) {
        return 6 * Math.pow(side, 2);
    }

    public static double getCylinderArea(double radius, double height) {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }

    public static double getPyramidArea(double basePerimeter, double apothem, double baseArea) {
        return 0.5 * basePerimeter * apothem + baseArea;
    }

    public static double getConeArea(double radius, double apothem) {
        return Math.PI * radius * apothem + Math.PI * Math.pow(radius, 2);
    }

    public static double getSphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static double getHalfSphereArea(double radius) {
        return 3 * Math.PI * Math.pow(radius, 2);
    }
}
