public class oopscopyconstruetor {
    public static void main(String[] args) {
        class student{
            String name;
            int age;

            public void printInfo(){
                System.out.println(this.name);
                System.out.println(this.age);
            }
            student(student s2){
                this.name=s2.name;
                this.age=s2.age;
            }
            student(){
        }
    }
    student s1=new student();
            s1.name="omm";
            s1.age=19;

            student s2=new student(s1);
            s2.printInfo();

    }

}
