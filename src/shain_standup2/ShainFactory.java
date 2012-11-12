package shain_standup2;

public class ShainFactory {
	public Shain factory(String type){
		if(type.equals("Tanto")){
			return new Tanto();
		}
		else if(type.equals("Shunin")){
			return new Shunin();
		}
		else if(type.equals("Bucho")){
			return new Bucho();
		}
		else{
			return new Tanto();
		}
	}

}
