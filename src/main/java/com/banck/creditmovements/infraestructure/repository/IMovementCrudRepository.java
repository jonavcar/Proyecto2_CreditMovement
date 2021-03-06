package com.banck.creditmovements.infraestructure.repository;

import com.banck.creditmovements.infraestructure.model.dao.MovementDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 *
 * @author jonavcar
 */
public interface IMovementCrudRepository extends ReactiveCrudRepository<MovementDao, String> {

    Flux<MovementDao> findAllByAccount(String account);

    Flux<MovementDao> findAllByCustomer(String customer);

    Flux<MovementDao> findAllByCustomerAndAccount(String customer, String account);
}
