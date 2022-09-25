public class Dimensions {
    int width, length, depth, area;

    public Dimensions(int width, int length, int depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
        area();
    }

    public void area() {
        this.area = length * width;
    }

    public String getDimensions() {
        return String.format("Width: %d\nLength: %d\nDepth: %d\n", width, length, depth);
    }
}
