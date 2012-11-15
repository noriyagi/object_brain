package composite;

import java.util.Collection;
import java.util.Iterator;

public class Manager {
	public static void main(String[] args){
		Juchu juchu = new Juchu(1);
		Chumonsha chumonsha = new Chumonsha("牛尾　剛","横浜市");
		Meisai meisai1 = new Meisai(1,"Thriller",2000);
		Meisai meisai2 = new Meisai(2,"Dangerous",2000);
		juchu.setChumonsha(chumonsha);
		juchu.addMeisai(meisai1);
		juchu.addMeisai(meisai2);
		
		System.out.println("受注伝票");
		System.out.println("受注番号：" + juchu.getJuchubango());
		Chumonsha person = juchu.getChumonsha();
		System.out.println("注文者　：" + person.getName());
		System.out.println("注文者住所：" + person.getAddress());
		System.out.println("受注明細番号\t注文商品\t\t価格");
		Collection<Meisai> meisais = juchu.getMeisai();
		
		Iterator<Meisai> iterator = meisais.iterator();
		// 合計の計算を、Juchuクラスに委譲した。
		// 明細の合計は、各明細を管理する親玉の受注クラスで行う。
		//int gokei = 0;
		
		while( iterator.hasNext()){
			Meisai meisai = (Meisai)iterator.next();
			System.out.println("" +
					meisai.getMeisaiBango() + "\t\t" +
					meisai.getProductName() + "\t" +
					meisai.getPrice() + "円");
			//gokei = gokei + meisai.getPrice();
		}
		System.out.println("----------------------------------------");
		System.out.println("    合計金額\t\t\t" + juchu.getMeisaiGoukei() + "円");
		
	}

}
