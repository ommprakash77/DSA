import java.util.*;
public class YourBioData {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String yourname;
            String yourbabyname;
            String address;
            String email;
            int age;
            long phoneNumber;

            System.out.print("Enter your name: ");
            yourname = sc.nextLine();

            System.out.print("Enter your baby name: ");
            yourbabyname = sc.nextLine();

            System.out.print("Enter your address: ");
            address = sc.nextLine();

            System.out.print("Enter your email: ");
            email = sc.nextLine();

            System.out.print("Enter your age: ");
            age = Integer.parseInt(sc.nextLine());

            System.out.print("Enter your phone number: ");
            phoneNumber = Long.parseLong(sc.nextLine());

            System.out.println("\n------ YOUR BIO DATA ------");
            System.out.println("Your Name: " + yourname);
            System.out.println("Your Baby Name: " + yourbabyname);
            System.out.println("Address: " + address);
            System.out.println("Email: " + email);
            System.out.println("Age: " + age);
            System.out.println("Phone Number: " + phoneNumber);
        }
    }

