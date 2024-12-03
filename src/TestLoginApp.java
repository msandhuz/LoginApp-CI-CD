import org.junit.Test;
import static org.junit.Assert.*;

public class TestLoginApp {

    @Test
    public void testValidLogin() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("valid@example.com", "password123");
        assertEquals("Expected User Name", result);
    }

    @Test
    public void testInvalidLogin() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("invalid@example.com", "wrongpassword");
        assertNull(result); // Ensure the result is null for invalid credentials
    }
}
