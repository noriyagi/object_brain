package composite2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Bumon implements Party {
	
	private String name;
	private Collection<Party> parties = new ArrayList<Party>();
	
	public Bumon(String name){
		this.name = name;
	}
	public void hyoji(){
		System.out.println("\n" + name);
		System.out.println("----------------");
		Iterator<Party> iterator = parties.iterator();
		while( iterator.hasNext()){
			Party party = (Party)iterator.next();
			party.hyoji();
		}
	}
	public void addParty(Party party){
		parties.add(party);
	}
	

}
