
public class UserManager{
	public void addUser(User user){
		System.out.println(user.getEmail() + " kullan�c�s� sisteme ba�ar�yla kaydedildi!");
	}
	
	public void deleteUser(User user){
		System.out.println(user.getEmail() + " kullan�c�s�n�n sistemden �yeli�i iptal edildi! ");
	}

}
