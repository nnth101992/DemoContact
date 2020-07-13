public class Contact {
    private String phoneNumber;
    private String name;
    private String group;
    private String gender;
    private String address;
    private String yearOfBirth;
    private String email;

    public Contact(String phoneNumber, String name, String group, String gender, String address, String yearOfBirth, String email) {

        this.phoneNumber = phoneNumber;
        this.name = name;
        this.group = group;
        this.gender = gender;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact: {" +
                "phone number='" + phoneNumber + '\'' +
                "| name='" + name + '\'' +
                "| group='" + group + '\'' +
                "| gender='" + gender + '\'' +
                "| address='" + address + '\'' +
                "| year of birth='" + yearOfBirth + '\'' +
                "| email='" + email + '\'' +
                '}';
    }
}
