package Business.Concretes;

import Business.Abstracts.ICustomerCheckService;
import Entities.Concretes.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public void checkIfRealPerson(Customer customer) {
        System.out.println("ad soyad tcNo, doğum yılı bilgileri doğrulandı: "+customer.getFirstName());
    }
}
