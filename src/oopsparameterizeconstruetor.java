public class oopsparameterizeconstruetor {
    public static void main(String[] args) {
        class student{
           String name;
           int age;

            public void printInfo(){
                System.out.println(this.name);
                System.out.println(this.age);
            }
            student(String name,int age){
                this.name=name;
                this.age=age;
            }
        }
        student s1=new student("omm",19);
        s1.printInfo();
    }
}
