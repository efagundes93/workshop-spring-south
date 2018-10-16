package br.com.southsystem.workshop.contabancaria.reposurory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.southsystem.workshop.contabancaria.model.Conta;

@Repository
public interface ContaRepository extends MongoRepository<Conta, String> {

}
