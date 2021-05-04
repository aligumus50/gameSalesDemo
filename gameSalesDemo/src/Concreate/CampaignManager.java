package Concreate;

import Abstract.CampaignService;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Sale;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Yeni kampanya tanýmlandý: " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi: " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi: " + campaign.getCampaignName());
		
	}

	


	
}
