public class oopsNonParameterConstruetor {
    public static void main(String[] args) {
        class student{
            String name;
            int age;

            public void printInfo(){
                System.out.println(this.name);
                System.out.println(this.age);
            }
            student(){
                System.out.println("construetor called");
            }
        }
        student s1=new student();
        s1.name="omm";
        s1.age=18;

        s1.printInfo();
    }
}
