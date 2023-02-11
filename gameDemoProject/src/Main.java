import Business.Concretes.CampaignManager;
import Business.Concretes.CustomerCheckManager;
import Business.Concretes.CustomerManager;
import Business.Concretes.GameManager;
import Entities.Concretes.Campaign;
import Entities.Concretes.Customer;
import Entities.Concretes.Game;

public class Main {
    public static void main(String[] args) {
        Game game=new Game();
        game.setId(1);
        game.setName("cod");
        game.setUnitPrice(56);

        Customer customer=new Customer();
        customer.setId(1);
        customer.setFirstName("ali");
        customer.setLastName("ak");

        CustomerManager customerManager=new CustomerManager();
        customerManager.save(customer);

        CustomerCheckManager customerCheckManager=new CustomerCheckManager();
        customerCheckManager.checkIfRealPerson(customer);

        Campaign campaign=new Campaign();
        campaign.setDiscountRate(50);
        campaign.setName("yüzde50");
        campaign.setId(1);

        CampaignManager campaignManager=new CampaignManager();
        campaignManager.add(campaign);

        GameManager gamaManager=new GameManager();
        gamaManager.add(game);
        gamaManager.sell(customer,game,campaign);
    }
}