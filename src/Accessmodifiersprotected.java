public class Accessmodifiersprotected {
    public static void main(String[] args) {
        Package bank;
        class Account {
            public String name;
            protected String email;
        }
            Account account1 = new Account();
            account1.name="omm";
            account1.email="kcsbcdbc8545@gmail.com";
            System.out.println(account1.name);
            System.out.println(account1.email);

        }
    }


