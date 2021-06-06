package abstracts;

import entities.Campaign;
import entities.Gamer;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
}
