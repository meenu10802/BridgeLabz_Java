package collectionsandstreams.exceptionhandling.problemstatement;
class UserAlreadyExistsException extends Exception {
    UserAlreadyExistsException(String msg) {
        super(msg);
    }
}

class UserNotFoundException extends Exception {
    UserNotFoundException(String msg) {
        super(msg);
    }
}

public class UserService {
    static void registerUser(String username) throws UserAlreadyExistsException {
        if (username.equals("admin"))
            throw new UserAlreadyExistsException("User already exists");
        System.out.println("User registered successfully");
    }

    static void checkUserExistence(String username) throws UserNotFoundException {
        if (!username.equals("admin"))
            throw new UserNotFoundException("User not found");
        System.out.println("User exists");
    }

    public static void main(String[] args) {
        try {
            registerUser("admin");
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkUserExistence("guest");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
