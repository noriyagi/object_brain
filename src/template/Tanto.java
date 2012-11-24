package template;

public class Tanto implements Shain{
	
	private String name;
	private int kihonkyu;
	
	public Tanto(String name, int kihonkyu){
		this.name = name;
		this.kihonkyu = kihonkyu;
	}
	
	public void standup(){
		System.out.println("担当" + name + "起立しました。給料は" + kihonkyu + "円です。");
	}

}
