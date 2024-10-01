import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import org.mockito.Mock;



public class TestingUserService {
     
    private UserService userservice;

    @Mock
    private UserRepository Userrepository;

    @BeforeClass
    public static void print(){
         System.out.println("Testing Started using Mockito");
    }


   @Before
   public void setUp(){

     Userrepository = mock(UserRepository.class);

     userservice = new UserService(Userrepository);
   }    
    

   @Test
   public void getUserName(){

  
    when(Userrepository.getUserId(1)).thenReturn("Mocked user");

    String userName = userservice.getUserName(1);

    System.out.println(" user-Name : " + userName);

    assertEquals("Mocked user", userName);

    verify(Userrepository).getUserId(1);

   }

   @AfterClass
    public static void print1(){
         System.out.println("Testing Finished");
    }
}
