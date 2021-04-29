
public class UserManager{
	public void addUser(User user){
		System.out.println(user.getEmail() + " kullanýcýsý sisteme baþarýyla kaydedildi!");
	}
	
	public void deleteUser(User user){
		System.out.println(user.getEmail() + " kullanýcýsýnýn sistemden üyeliði iptal edildi! ");
	}

}
