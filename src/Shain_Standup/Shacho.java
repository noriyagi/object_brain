package shain_Standup;

public class Shacho {
	public static void main(String[] args){
		Shain shain = null;
		
		if(args[0].equals("Tanto")){
			shain = new Tanto();
		}
		else if(args[0].equals("Shunin")){
			shain = new Shunin();
		}
		else if(args[0].equals("Bucho")){
			shain = new Bucho();
		}
		else if(args[0].equals("Torishimariyaku")){
			shain = new Torishimariyaku();
		}
		else{
			System.out.println("���Ȃ��͒N�ł����H");
		}
		
		/**
		 * �|�����[��P�e
		 * �S����shain�Ƃ��Ĉ������ƁB
		 */
		shain.standup();

		/**
		 * �|�����[��Q�e
		 * ���K�Q�����v�Z
		 */
		int kihonkyu = Integer.parseInt(args[1]);
		int Kyuryo = shain.getKyuryo(kihonkyu);
		System.out.println("���̋�����" + Kyuryo + "�~�ł��B" );
	}

}
