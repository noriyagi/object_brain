package template;

public class Bucho implements Shain{
	
	private String name;
	private int kihonkyu;
	
	public Bucho(String name, int kihonkyu){
		this.name = name;
		this.kihonkyu = kihonkyu;
	}
	
	public void standup(){
		int Kyuryo = kihonkyu * 3;
		System.out.println("����" + name + "�N�����܂����B������" + Kyuryo + "�~�ł��B");
	}

}
