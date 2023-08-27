package ir.legocode.jpa04.base.repository;

import ir.legocode.jpa04.base.models.BaseEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface BaseEntityRepository<E extends BaseEntity<ID>, ID extends Serializable> {

    E save(E e);

    E update(E e);

    E saveOrUpdate(E e);

    E findById(ID id);

    List<E> findAll();

    void delete(E e);

    boolean exsistsById(ID id);

    Long countAll();


    EntityManager getEntityManager();
}
