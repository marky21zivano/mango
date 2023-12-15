package org.mango.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.mango.models.Teste;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TesteRepository implements PanacheMongoRepository<Teste> {

}
