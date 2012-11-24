package template;

public class Shunin implements Shain{
	
	private String name;
	private int kihonkyu;
	
	public Shunin(String name, int kihonkyu){
		this.name = name;
		this.kihonkyu = kihonkyu;
	}
	
	public void standup(){
		int Kyuryo = (kihonkyu * 2) +1 ;
		System.out.println("•”’·" + name + "‹N—§‚µ‚Ü‚µ‚½B‹‹—¿‚Í" + Kyuryo + "‰~‚Å‚·B");
	}

}
