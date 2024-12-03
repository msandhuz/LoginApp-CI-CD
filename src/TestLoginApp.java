import org.junit.Test;
import static org.junit.Assert.*;

public class TestLoginApp {

    @Test
    public void testValidLogin() {
        // Here, we only test the authentication logic, not the GUI
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("valid@example.com", "password123");
        assertEquals("Expected User Name", result); // Replace with actual expected value
    }

    @Test
    public void testInvalidLogin() {
        // Testing invalid login without any GUI interaction
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("invalid@example.com", "wrongpassword");
        assertNull(result); // Ensure the result is null for invalid credentials
    }
}
