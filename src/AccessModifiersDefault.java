public class AccessModifiersDefault {
    public static void main(String[] args) {
        Package bank;
        class Account{
            String name;
        }
        Account account1=new Account();
        account1.name="omm";
        System.out.println(account1.name);
    }
}
