package Business.Abstracts;

import Entities.Concretes.Customer;

public interface ICustomerCheckService {
    void checkIfRealPerson(Customer customer);
}
