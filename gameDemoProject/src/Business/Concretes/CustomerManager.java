package Business.Concretes;

import Business.Abstracts.ICustomerService;
import Entities.Concretes.Customer;

public class CustomerManager implements ICustomerService {
    @Override
    public void save(Customer customer) {
        System.out.println( customer.getFirstName() + " isimli kullanici basari ile eklendi!");
    }

    @Override
    public void update(Customer customer) {
        System.out.println( customer.getFirstName() + " isimli kullanici basari ile güncellendi!");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println( customer.getFirstName() + " isimli kullanici basari ile silindi!");
    }
}
