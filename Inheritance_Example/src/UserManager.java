
public class UserManager{
	public void addUser(User user){
		System.out.println(user.getEmail() + " kullanıcısı sisteme başarıyla kaydedildi!");
	}
	
	public void deleteUser(User user){
		System.out.println(user.getEmail() + " kullanıcısının sistemden üyeliği iptal edildi! ");
	}

}
