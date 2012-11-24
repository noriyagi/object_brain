package template;

public class Shacho {
	public static void main(String[] args){
		Shain shain = null;
		
		if(args[0].equals("Tanto")){
			shain = new Tanto(args[1], Integer.parseInt(args[2]));
		}
		if(args[0].equals("Shunin")){
			shain = new Shunin(args[1], Integer.parseInt(args[2]));
		}
		if(args[0].equals("Bucho")){
			shain = new Bucho(args[1], Integer.parseInt(args[2]));
		}
		shain.standup();
	}

}
