public class UserService{

      private UserRepository userrepository;

      public UserService( UserRepository userrepository){
            this.userrepository = userrepository;
      }

      public void deleteUser(int userId){
         userrepository.deleteUserById(userId);
      }
}