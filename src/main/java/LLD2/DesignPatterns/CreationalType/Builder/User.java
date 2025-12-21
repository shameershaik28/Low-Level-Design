package LLD2.DesignPatterns.CreationalType.Builder;

class User {

    // required
    private final String name;
    private final int age;

    // optional
    private final String email;
    private final String phone;
    private final String address;

    // private constructor - only Builder can create User
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // static method to get Builder instance
    public static Builder getBuilder() {
        return new Builder();
    }

    // static inner Builder class
    public static class Builder {

        // same attributes as User
        private String name;   // required
        private Integer age;   // required (use wrapper to allow null)

        private String email;  // optional
        private String phone;  // optional
        private String address;// optional

        // Setter-style builder methods
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // build() method with VALIDATION for required fields
        public User build() {
            if (name == null) {
                throw new IllegalStateException("Name is a required field.");
            }
            if (age < 18 ) {
                throw new IllegalStateException("Age must be greater than 18.");
            }
            if (age == null ) {
                throw new IllegalStateException("Age is a required field.");
            }

            return new User(this);
        }
    }

    // to print user details
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age +
                ", email='" + email + "', phone='" + phone +
                "', address='" + address + "'}";
    }
}


