final class SecuritySystem {
    public void authenticateUser(String username, String password) {
        String validUsername = "admin";
        String validPassword = "secure123";

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Authentication successful! Access granted.");
        } else {
            System.out.println("Authentication failed! Invalid credentials.");
        }
    }
}

// This will cause an error if uncommented
// class AdvancedSecurity extends SecuritySystem {
//     @Override
//     public void authenticateUser(String u, String p) {
//         System.out.println("Attempt to override final class.");
//     }
// }

public class SecuritySystemDemo {
    public static void main(String[] args) {
        SecuritySystem security = new SecuritySystem();

        System.out.println("Test Case 1: Valid Credentials");
        security.authenticateUser("admin", "secure123");

        System.out.println("\nTest Case 2: Invalid Credentials");
        security.authenticateUser("user", "wrongpass");
    }
}
