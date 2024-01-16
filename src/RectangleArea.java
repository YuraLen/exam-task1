public class RectangleArea {
    double length;
    double width;

    public RectangleArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double profil(){
        return length * width;
    }
}
