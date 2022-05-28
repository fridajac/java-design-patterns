package BuilderPattern;

public class Account {

    private final int id;
    private final String email;
    private final Name name;

    private Account(Builder builder){
        this.id = builder.id;
        this.email = builder.email;
        this.name = builder.name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    public static class Builder {

        private int id;
        private String email;
        private Name name;

        public Builder id(final int id){
            this.id = id;
            return this;
        }

        public Builder email(final String email){
            this.email = email;
            return this;
        }

        public Builder name(final Name name){
            this.name = name;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }
}
