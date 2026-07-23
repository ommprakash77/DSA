public class oopsCompileTimePolymorphism {
    public static void main(String[] args) {
        class student {
            String name;
            int age;

            public void printInfo(String name) {
                System.out.println(name);
            }

            public void printInfo(int age) {
                System.out.println(age);
            }

            public void printInfo(String name, int age) {
                System.out.println(name+" "+ age);
            }
        }
            student s1=new student();
            s1.name="omm";
            s1.age=15;
            s1.printInfo(s1.name,s1.age);
    }
}
