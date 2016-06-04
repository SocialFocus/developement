/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.proyectofinal.integradorrs.repositorys;

import edu.proyectofinal.integradorrs.model.Transaction;
import java.util.List;
import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author MarianoAndres
 */
public interface CouchbaseRepository extends CrudRepository<Transaction, String> {
    
 /**
     * Additional custom finder method, backed by an auto-generated
     * N1QL query.
     */
    List<Transaction> findByLastnameAndAgeBetween(String lastName, int minAge,
        int maxAge);

    /**
     * Additional custom finder method, backed by a View that indexes
     * the names.
     */
    @View(designDocument = "transaction", viewName = "byID")
    List<Transaction> findByLastname(String id);

 
    
    
}
