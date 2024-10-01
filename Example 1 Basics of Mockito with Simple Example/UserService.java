public class UserService {
    private UserRepository Userrepository;

    public UserService(UserRepository  Userrepository){
       this.Userrepository = Userrepository;
    }
    
    public String getUserName(int userId){
      return Userrepository.getUserId(userId);
    }
}
