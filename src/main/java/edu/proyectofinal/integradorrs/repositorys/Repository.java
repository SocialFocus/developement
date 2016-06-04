package edu.proyectofinal.integradorrs.repositorys;

import edu.proyectofinal.integradorrs.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Collection;
/**
 * Created by maraino on 25/03/16.
 */
public interface Repository extends MongoRepository<Transaction, String> {

    Transaction findByMerchant(String merchant);
    Collection<Transaction> findByAmount(String amount);
}
