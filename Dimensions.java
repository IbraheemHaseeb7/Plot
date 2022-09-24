public class Dimensions {
    int width, length, depth;

    public Dimensions(int width, int length, int depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    public int area() {
        return length * width;
    }
}
