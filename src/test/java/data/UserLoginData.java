package data;

import lombok.Value;

@Value
public class UserLoginData {

    String emailAddress;
    String password;

    public String getEmailAddress() {
        return emailAddress;
    }
    public String getPassword() {
        return password;
    }

}
