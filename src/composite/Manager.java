package composite;

import java.util.Collection;
import java.util.Iterator;

public class Manager {
	public static void main(String[] args){
		Juchu juchu = new Juchu(1);
		Chumonsha chumonsha = new Chumonsha("�����@��","���l�s");
		Meisai meisai1 = new Meisai(1,"Thriller",2000);
		Meisai meisai2 = new Meisai(2,"Dangerous",2000);
		juchu.setChumonsha(chumonsha);
		juchu.addMeisai(meisai1);
		juchu.addMeisai(meisai2);
		
		System.out.println("�󒍓`�[");
		System.out.println("�󒍔ԍ��F" + juchu.getJuchubango());
		Chumonsha person = juchu.getChumonsha();
		System.out.println("�����ҁ@�F" + person.getName());
		System.out.println("�����ҏZ���F" + person.getAddress());
		System.out.println("�󒍖��הԍ�\t�������i\t\t���i");
		Collection<Meisai> meisais = juchu.getMeisai();
		
		Iterator<Meisai> iterator = meisais.iterator();
		// ���v�̌v�Z���AJuchu�N���X�ɈϏ������B
		// ���ׂ̍��v�́A�e���ׂ��Ǘ�����e�ʂ̎󒍃N���X�ōs���B
		//int gokei = 0;
		
		while( iterator.hasNext()){
			Meisai meisai = (Meisai)iterator.next();
			System.out.println("" +
					meisai.getMeisaiBango() + "\t\t" +
					meisai.getProductName() + "\t" +
					meisai.getPrice() + "�~");
			//gokei = gokei + meisai.getPrice();
		}
		System.out.println("----------------------------------------");
		System.out.println("    ���v���z\t\t\t" + juchu.getMeisaiGoukei() + "�~");
		
	}

}
