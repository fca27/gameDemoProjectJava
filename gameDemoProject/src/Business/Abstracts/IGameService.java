package Business.Abstracts;

import Entities.Concretes.Campaign;
import Entities.Concretes.Customer;
import Entities.Concretes.Game;

public interface IGameService {
    void add(Game game);
    void sell(Customer customer, Game game);
    void sell(Customer customer, Game game, Campaign campaign);

}
