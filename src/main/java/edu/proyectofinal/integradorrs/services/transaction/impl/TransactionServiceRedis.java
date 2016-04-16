package edu.proyectofinal.integradorrs.services.transaction.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.proyectofinal.integradorrs.model.Transaction;
import edu.proyectofinal.integradorrs.services.transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by mariano on 24/03/16.
 */
@Service("TransactionServiceRedis")
public class TransactionServiceRedis implements TransactionService{
    @Autowired
    private StringRedisTemplate template;

    public Collection<Transaction> getAll() {
        List<Transaction> result = new ArrayList<>();
        result.add(new Transaction("1234", "op123", "23", "algo@algo.com", "sec121324345"));
        return result;
    }

    @Override
    public Transaction getById(String id) {
        return null;
    }

    public Transaction save(Transaction t){
        ObjectMapper obmap = new ObjectMapper();
        this.template.opsForHash().putAll(t.getMerchant(), obmap.convertValue(t, Map.class));
        return t;
    }
}
