package abstracts;

import entities.Gamer;

public interface GamerService {
	void register(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}	
