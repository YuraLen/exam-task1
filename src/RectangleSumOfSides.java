public class RectangleSumOfSides {
    double side1;
    double side2;

    public RectangleSumOfSides(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    double profil(){
        return side1 + side2;
    }
}
