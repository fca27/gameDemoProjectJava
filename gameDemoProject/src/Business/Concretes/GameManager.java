package Business.Concretes;

import Business.Abstracts.IGameService;
import Entities.Concretes.Campaign;
import Entities.Concretes.Customer;
import Entities.Concretes.Game;

public class GameManager implements IGameService {
    @Override
    public void add(Game game) {
        System.out.println(game.getName()+" oyun eklendi");
    }

    @Override
    public void sell(Customer customer, Game game) {
        System.out.println(customer.getFirstName()+" aldı : "+game.getName()+"fiyat: "+game.getUnitPrice());
    }

    @Override
    public void sell(Customer customer, Game game, Campaign campaign) {
        System.out.println(customer.getFirstName()+" aldı : "+game.getName()+"kampanyalı fiyat: "
                +game.getUnitPrice()*campaign.getDiscountRate()/100);
    }
}
