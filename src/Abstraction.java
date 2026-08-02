public class Abstraction {
    public static void main(String[] args) {
        abstract class Animal{
            abstract void walk();
        }
        class Horse extends Animal{
            public void walk(){
                System.out.println("walk on 4 legs");
            }
        }
        class chicken extends Animal{
            public void walk(){
                System.out.println("walk on 2 legs");
            }
        }
        Horse horse=new Horse();
        horse.walk();
        chicken chicken=new chicken();
        chicken.walk();
    }
}
