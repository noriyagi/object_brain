package composite2;

public class Manager {
	public static void main(String[] args){
		User ushio = new User("��������");
		User ando = new User("��������");
		
		Bumon systemBumon = new Bumon("�V�X�e����");
		systemBumon.addParty(ushio);
		systemBumon.addParty(ando);
		
		User mizukoshi = new User("���z����");
		User kawano = new User("��삳��");
		
		Bumon eigyoBumon = new Bumon("�c�ƕ�");
		eigyoBumon.addParty(mizukoshi);
		eigyoBumon.addParty(kawano);
		
		Bumon jigyobu = new Bumon("�������ƕ�");
		jigyobu.addParty(systemBumon);
		jigyobu.addParty(eigyoBumon);
		// �\�����W�b�N
		jigyobu.hyoji();
		
	}

}
