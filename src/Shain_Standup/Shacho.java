package Shain_Standup;

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
		else{
			System.out.println("Ç†Ç»ÇΩÇÕíNÇ≈Ç∑Ç©ÅH");
		}
		shain.standup();
	}

}
