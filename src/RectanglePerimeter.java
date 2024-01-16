public class RectanglePerimeter {
    double length;
    double width;

    public RectanglePerimeter(double length, double wigth) {
        this.length = length;
        this.width = wigth;
    }

    double profil() {
        return 2 * (length + width);
    }
}
