package BuilderPattern;

public class Main {

    public static void main(String[] args) {
        Name name = new Name.Builder().firstName("Frida")
                                        .middleName("Helena")
                                        .surname("Jacobsson")
                                        .build();

        //Immutable Account object (can't change)
        Account account = new Account.Builder().id(1).email("Frida@mail.com").name(name).build();

        System.out.println(account.getName().getFirstName());

    }
}
