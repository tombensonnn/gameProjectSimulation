package concretes;

import java.util.Date;

import abstracts.CampaignService;
import entities.Campaign;
import entities.Gamer;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added. Name: " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated.");
		
	}


	
}
