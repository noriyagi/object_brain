package shain_Standup;

public class Torishimariyaku implements Shain {
	public void standup(){
		System.out.println("����������Ȃ�̂����ɗ����܂���");
	}

	public int getKyuryo(int kihonkyu) {
		return kihonkyu * 4 +2;
	}
}
