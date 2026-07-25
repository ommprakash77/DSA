public class SingleLevelInheritance {
    public static void main(String[] args) {
        class shape{
            public void area(){
                System.out.println(" Triangle area");
            }
        }
        class Triangle  extends shape{
            public void area(int l,int h){
                System.out.println(l*h/2);
            }
        }
        Triangle t1=new Triangle();
        t1.area();
        t1.area(10,20);
    }
}
