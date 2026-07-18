public class oopsThis {
    public static void main(String[] args) {

        class pen{
            String color;
            String type;

            public void write(){
                System.out.println("writing something....");
            }
            public void printcolor(){
                System.out.println(this.color);
            }
        }
        pen pen1=new pen();
        pen1.color="black";
        pen1.type="gel";

        pen pen2=new pen();
        pen2.color="blue";
        pen2.type="ball point";

        pen1.write();
        pen1.printcolor();
        pen2.printcolor();

    }
}
