package Business.Concretes;

import Business.Abstracts.ICampaignService;
import Entities.Concretes.Campaign;

public class CampaignManager implements ICampaignService {
    public CampaignManager(){}
    @Override
    public void add(Campaign campaign) {
        System.out.println("kampanya eklendi: "+campaign.getName());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("kampanya güncellendi: "+campaign.getName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("kampanya silindi: "+campaign.getName());
    }
}
