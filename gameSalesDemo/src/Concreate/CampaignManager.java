package Concreate;

import Abstract.CampaignService;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Sale;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Yeni kampanya tan�mland�: " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi: " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi: " + campaign.getCampaignName());
		
	}

	


	
}
