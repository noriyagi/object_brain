package composite;

import java.util.ArrayList;
import java.util.Collection;

public class Juchu {
	private int juchubango;
	private Chumonsha chumonsha;
	private Collection<Meisai> meisais = new ArrayList<Meisai>();
	
	public Juchu(int juchubango){
		this.juchubango = juchubango;
	}
	public void addMeisai(Meisai meisai){
		meisais.add(meisai);
	}
	public Collection<Meisai> getMeisai(){
		return meisais;
	}
	public void setChumonsha(Chumonsha chumonsha){
		this.chumonsha = chumonsha;
	}
	public Chumonsha getChumonsha(){
		return chumonsha;
	}
	public int getJuchubango(){
		return juchubango;
	}

}
