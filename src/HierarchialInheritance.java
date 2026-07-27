public class HierarchialInheritance {
    public static void main(String[] args) {
        class shape {
            public void area() {
                System.out.println("display area");
            }
        }
        class Triangle extends shape {
            public void area(int l, int h) {
                System.out.println(l * h / 2);
            }
        }
        class circle extends shape {
            public void area(int r) {
                System.out.println((3.14) * r * r);
            }
        }
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(10, 20);
        circle c1 = new circle();
        c1.area();
        c1.area(5);
    }
}
