public class Main {
    public static void main(String[] args) {
        RectanglePerimeter rectangle1 = new RectanglePerimeter(5, 8);
        RectangleArea rectangle2 = new RectangleArea(4, 6);
        RectangleSumOfSides rectangle3 = new RectangleSumOfSides(7, 9);

        System.out.println("Периметр прямокутника: " + rectangle1.profil());
        System.out.println("Площа прямокутника: " + rectangle2.profil());
        System.out.println("Сума двох довших сторін прямокутника: " + rectangle3.profil());
    }
}