public class Accessmodifiersprivate {
    public static void main(String[] args) {
        Package bank;
        class Account {
            public String name;
            protected String email;
            private String password;

            // gettesrs & setters

            public String getpassword() {
                return this.password;
            }

            public void setpassword(String pass) {
                this.password = pass;
            }
        }
        Account account1 = new Account();
        account1.name = "omm";
        account1.email = "ommprakavs54@gmail.com";
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());
    }
}