public class Vector {
    private double[] elements;

    public Vector(double[] elements) {
        this.elements = elements;
    }

    public double magnitude() {
        double sum = 0;
        for (double element : elements) {
            sum += element * element;
        }
        return Math.sqrt(sum);
    }

    public Vector add(Vector other) {
        if (this.elements.length != other.elements.length) {
            throw new IllegalArgumentException("Vectors must be the same length");
        }
        double[] result = new double[this.elements.length];
        for (int i = 0; i < this.elements.length; i++) {
            result[i] = this.elements[i] + other.elements[i];
        }
        return new Vector(result);
    }

    public double dotProduct(Vector other) {
        if (this.elements.length != other.elements.length) {
            throw new IllegalArgumentException("Vectors must be the same length");
        }
        double sum = 0;
        for (int i = 0; i < this.elements.length; i++) {
            sum += this.elements[i] * other.elements[i];
        }
        return sum;
    }
}
