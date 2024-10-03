import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {
    

    @BeforeClass
    public static void print(){
        System.out.println("Testing Started");
    }

    @Mock
    private UserRepository userrepository;

    @InjectMocks
    private UserService userservice;

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void TestDeleteUser(){
        userservice.deleteUser(1);

        verify(userrepository).deleteUserById(1);

    }

    public void TestDeletedUserByIdThrowsException(){

        doThrow(new RuntimeException("User Not Found")).when(userrepository).deleteUserById(1);

        try{
          userservice.deleteUser(1);
          fail("Expected The Exception to be Thrown");
        }catch(RuntimeException e){
           assertEquals("User Not Found", e.getMessage());
        }
       
        verify(userrepository).deleteUserById(1);
    } 
 
    @AfterClass
    public static void print1(){
      System.out.println("All test Cases passed");
    }
}
