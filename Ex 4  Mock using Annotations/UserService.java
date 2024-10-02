public class UserService {

    private UserRepository userrepository;

    public UserService(UserRepository userrepository){
          this.userrepository = userrepository;
    }

    public String getUserName(int userId){
        return userrepository.getUserId(userId);
    }
    
}
