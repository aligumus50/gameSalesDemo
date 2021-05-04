package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public interface SaleService {

	void withoutCampaignbuy(Game game, Member member);
	void withCampaignBuy(Game game, Member member, Campaign campaign);
	
}
