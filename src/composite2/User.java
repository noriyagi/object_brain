package composite2;

public class User implements Party{
	
	private String name;
	
	public User(String name){
		this.name = name;
	}
	public void hyoji(){
		System.out.println(name);
	}
}
