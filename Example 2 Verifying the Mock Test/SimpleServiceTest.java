import org.junit.Test;
import static org.mockito.Mockito.*;

public class SimpleServiceTest {

    @Test
    public void testGetMessage() {
        // Create a mock object of SimpleService
        SimpleService mockService = mock(SimpleService.class);

        // Define the behavior of the mock
        when(mockService.getMessage()).thenReturn("Hello, Mockito!");

        // Perform the test
        String message = mockService.getMessage();
        System.out.println(message);  // Should print "Hello, Mockito!"

        // Verify that the getMessage method was called
        verify(mockService).getMessage();
    }
}