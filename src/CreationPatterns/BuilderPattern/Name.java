package CreationPatterns.BuilderPattern;

public class Name {

    private String firstName;
    private String middleName;
    private String surname;

    private Name (Builder builder){
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.surname = builder.surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public static class Builder{

        private String firstName;
        private String middleName;
        private String surname;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder middleName(String middleName){
            this.middleName = middleName;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }
}
