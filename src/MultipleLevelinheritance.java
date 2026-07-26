public class MultipleLevelinheritance {
    public static void main(String[] args) {
        class shape{
            public void area(){
                System.out.println("diplay area");
            }
        }
        class Triangle extends shape{
            public void area(int l,int h){
                System.out.println(l*h/2);
            }
        }
        class Equlateraltriangle extends Triangle{
            public void area(int l,int h){
                System.out.println(l*h/2);
            }
        }
        Triangle t1=new Triangle();
        t1.area();
        t1.area(10,20);
        Equlateraltriangle e2=new Equlateraltriangle();
        e2.area();
        e2.area(20,30);
    }
}
