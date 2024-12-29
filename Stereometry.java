public class Stereometry {
    public static double cubeVolume(double side) {
        return Math.pow(side, 3);
    }

    public static double cubeSurfaceArea(double side) {
        return 6 * Math.pow(side, 2);
    }

    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double sphereSurfaceArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static double cylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double cylinderSurfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }

    public static double coneVolume(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    public static double coneSurfaceArea(double radius, double slantHeight) {
        return Math.PI * radius * (radius + slantHeight);
    }
}
