package JFrame;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import JFrame.SignUp;

public class UserData {
    private static final String USER_DATA_FILE = "users.dat"; // File to store user data
        
    private static List<User> users = new ArrayList<>();
        
    public static void init() {
        loadUsersFromFile(); // Load users from file when application starts up
    }

    public static void addUser(User user) {
        users.add(user);
        saveUsersToFile(); // Save users to file after adding a new user
    }

    public static User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    private static void saveUsersToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USER_DATA_FILE))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadUsersFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(USER_DATA_FILE))) {
            users = (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // If file doesn't exist or error occurs during reading, just continue with an empty list
            users = new ArrayList<>();
        }
        
    }
}