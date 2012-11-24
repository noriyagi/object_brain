package composite2;

public class Manager {
	public static void main(String[] args){
		User ushio = new User("牛尾さん");
		User ando = new User("安藤さん");
		
		Bumon systemBumon = new Bumon("システム部");
		systemBumon.addParty(ushio);
		systemBumon.addParty(ando);
		
		User mizukoshi = new User("水越さん");
		User kawano = new User("川野さん");
		
		Bumon eigyoBumon = new Bumon("営業部");
		eigyoBumon.addParty(mizukoshi);
		eigyoBumon.addParty(kawano);
		
		Bumon jigyobu = new Bumon("製造事業部");
		jigyobu.addParty(systemBumon);
		jigyobu.addParty(eigyoBumon);
		// 表示ロジック
		jigyobu.hyoji();
		
	}

}
