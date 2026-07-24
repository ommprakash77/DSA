public class Inheritance {
    public static void main(String[] args) {
        class shape {
            String color;
        }
        class Triangle extends shape {
        }
        Triangle t1 = new Triangle();
        t1.color = "red";
        System.out.println(t1.color);
    }
}
