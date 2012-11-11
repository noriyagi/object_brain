package shain_standup2;

public class Shunin extends Shain{
	public void standup(){
		System.out.println("å”C‚ª‘f‘‚­—§‚¿ã‚ª‚è‚Ü‚µ‚½");
	}
	public int getKyuryo(){
		int kihonkyu = getKihonkyu();
		return kihonkyu * 2 + 1;
	}

}
