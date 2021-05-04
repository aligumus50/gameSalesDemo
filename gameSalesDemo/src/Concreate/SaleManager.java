package Concreate;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class SaleManager implements SaleService{

	@Override
	public void withoutCampaignbuy(Game game, Member member) {
		
		System.out.println(member.getUserName() + " kullanýcýsý " + game.getGameName() +" oyununu satýn almýþtýr.");
		
	}

	@Override
	public void withCampaignBuy(Game game, Member member, Campaign campaign) {
		
		System.out.println(member.getUserName() + " kullanýcýsý " + game.getGameName() +" oyununu " + campaign.getCampaignName()+" ile indirimli satýn almýþtýr.");
		
	}

}
