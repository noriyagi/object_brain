package template;

public class Tanto implements Shain{
	
	private String name;
	private int kihonkyu;
	
	public Tanto(String name, int kihonkyu){
		this.name = name;
		this.kihonkyu = kihonkyu;
	}
	
	public void standup(){
		System.out.println("�S��" + name + "�N�����܂����B������" + kihonkyu + "�~�ł��B");
	}

}
