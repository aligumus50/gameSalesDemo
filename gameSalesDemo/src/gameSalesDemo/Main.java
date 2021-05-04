package gameSalesDemo;

import java.sql.Date;

import Adapter.MernisServiceAdapterManager;
import Concreate.CampaignManager;
import Concreate.GameManager;
import Concreate.MemberManager;
import Concreate.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class Main {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.setId(1);
		member.setUserName("write to username");
		member.setFirstName("write to name");
		member.setLastName("write to surname");
		member.setEmail("*****@hotmail.com");
		member.setDateOfBirth(new Date(0, 0, 0));
		member.setNationalityId("******");

		Game game = new Game();
		game.setId(1);
		game.setGameName("GAME21");
		game.setGameType("SPORT");
		game.setPrice(1500);
		
		Game game2 = new Game();
		game2.setId(1);
		game2.setGameName("GAME20");
		game2.setGameType("SPORT");
		game2.setPrice(1500);
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("Bahar Kampanyasý");
		campaign.setCampaignDiscount(100);
		
		MemberManager memberManager = new MemberManager(new MernisServiceAdapterManager());
		memberManager.add(member);
		//memberManager.delete(member);
		//memberManager.update(member);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		//gameManager.delete(game);
		//gameManager.update(game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		//campaignManager.delete(campaign);
		//campaignManager.update(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.withoutCampaignbuy(game, member);
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.withCampaignBuy(game2, member, campaign);
		
		
		

	}

}
