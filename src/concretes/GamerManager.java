package concretes;

import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void register(Gamer gamer) {
		System.out.println("Succeed! Name: " + gamer.getFirstName() + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer updated.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted.");
		
	}
	
}
