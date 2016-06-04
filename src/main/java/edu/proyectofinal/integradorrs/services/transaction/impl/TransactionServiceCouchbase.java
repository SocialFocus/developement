/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.proyectofinal.integradorrs.services.transaction.impl;

import edu.proyectofinal.integradorrs.model.Transaction;
import edu.proyectofinal.integradorrs.repositorys.CouchbaseRepository;
import edu.proyectofinal.integradorrs.services.transaction.TransactionService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author MarianoAndres
 */
@Service
@Qualifier("transactionServiceCouchbase")
public class TransactionServiceCouchbase implements TransactionService {

    private final CouchbaseRepository repository;

    @Autowired
    public TransactionServiceCouchbase(CouchbaseRepository repository) {
        this.repository = repository;
    }

    public Collection<Transaction> getAll() {
        return null;
    }

    @Override
    public Transaction getById(String id) {
        return null;
    }

    public Transaction save(Transaction t) {
        repository.deleteAll();

         Transaction trx = new Transaction();
//        trx.setAmount("123123");
//        trx.setEmailCliente("mariano.dim@gmail.com");
//        trx.setId("1");
//        trx.setMerchant("123123");
//        trx.setOperationId("asdasdasd");
//        trx.setSecurity("asdasdasd");

         trx = repository.save(t);
//        List<Transaction> idmensaje =
//            repository.findByLastNameAndAgeBetween("Jackson", 0, 18);
        return trx;
    }
}
