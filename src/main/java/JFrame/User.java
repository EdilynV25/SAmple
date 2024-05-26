package JFrame;

public class User {
    
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String username;
    private String password;

    public User(String firstName, String lastName, String middleName, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}

