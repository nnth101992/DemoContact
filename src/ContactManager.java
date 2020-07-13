import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ContactManager {
    public boolean verifyEmail(String email) {
        String regexEmail = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        return Pattern.matches(regexEmail, email);
    }

    public boolean verifyPhoneNumber(String phoneNumber) {
        String regexPhoneNumber = "^[0][1-9][0-9]{8}$";
        return Pattern.matches(regexPhoneNumber, phoneNumber);
    }

    public boolean verifyYearOfBirth(String yearOfBirth) {
        String regexYearOfBirth = "^19[2-9][0-9]|20[0-1][0-9]$";
        return Pattern.matches(regexYearOfBirth, yearOfBirth);
    }

    public boolean verifyGender(String gender) {
        String regexGender = "^Male$|^Female$|^Others$";
        return Pattern.matches(regexGender, gender);
    }

    public String checkAllField(String phoneNumber, String name, String group, String gender, String address, String yearOfBirth, String email) {
        String result;
        if (phoneNumber.equals("") || name.equals("") || group.equals("") || gender.equals("") || address.equals("") || yearOfBirth.equals("") || email.equals("")) {
            result = "Field value can't empty, please re-input:";
        } else if (!verifyPhoneNumber(phoneNumber)) {
            result = "Wrong format of phone number!";
        } else if (!verifyGender(gender)) {
            result = "Wrong format of gender!";
        } else if (!verifyYearOfBirth(yearOfBirth)) {
            result = "Wrong format of year of birth!";
        } else if (!verifyEmail(email)) {
            result = "Wrong format of email!";
        } else
            result = "Right!";
        return result;
    }

    public int checkPhone(String phoneNumber, ArrayList<Contact> contactList) {
        int index = -1;
        for (int i = 0; i < contactList.size(); i++) {
            if (phoneNumber.equals(contactList.get(i).getPhoneNumber())) {
                index = i;
                break;
            }
        }
        return index;
    }
}
