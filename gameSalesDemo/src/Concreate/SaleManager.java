package Concreate;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class SaleManager implements SaleService{

	@Override
	public void withoutCampaignbuy(Game game, Member member) {
		
		System.out.println(member.getUserName() + " kullan�c�s� " + game.getGameName() +" oyununu sat�n alm��t�r.");
		
	}

	@Override
	public void withCampaignBuy(Game game, Member member, Campaign campaign) {
		
		System.out.println(member.getUserName() + " kullan�c�s� " + game.getGameName() +" oyununu " + campaign.getCampaignName()+" ile indirimli sat�n alm��t�r.");
		
	}

}
