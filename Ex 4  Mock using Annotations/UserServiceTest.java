//Writing all the Import statement:-
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;

public class UserServiceTest {

    @Mock
    private UserRepository userrepository;

    @InjectMocks
    private UserService userservice;
  
    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }
    
    @Test 
    public void TestgetUserNameWithId(){
      
    when(userrepository.getUserId(1)).thenReturn("Mocked User");
      
    String strName = userservice.getUserName(1);
    assertEquals(strName , "Mocked User");

    verify(userrepository).getUserId(1);
   }
}
