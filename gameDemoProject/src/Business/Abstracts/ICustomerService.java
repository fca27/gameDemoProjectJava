package Business.Abstracts;

import Entities.Concretes.Customer;

public interface ICustomerService {
    void save(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
}
