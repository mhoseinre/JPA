package ir.legocode.jpa04.base.service;

import ir.legocode.jpa04.base.models.BaseEntity;
import ir.legocode.jpa04.base.repository.BaseEntityRepository;

import java.io.Serializable;
import java.util.List;

public abstract class BasrEntityServiceImpl<E extends BaseEntity<ID>, ID extends Serializable, R extends BaseEntityRepository<E, ID>> implements BaseEntityService<E, ID> {

    protected final R repository;

    public BasrEntityServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public E save(E e) {
        repository.getEntityManager().getTransaction().begin();
        e = repository.save(e);
        repository.getEntityManager().getTransaction().commit();
        return e;
    }

    @Override
    public E update(E e) {
        return null;
    }

    @Override
    public E saveOrUpdate(E e) {
        return null;
    }

    @Override
    public E findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(E e) {
        repository.getEntityManager().getTransaction().begin();
        repository.delete(e);
        repository.getEntityManager().getTransaction().commit();
    }

    @Override
    public boolean exsistsById(ID id) {
        return repository.exsistsById(id);
    }

    @Override
    public Long countAll() {
        return repository.countAll();
    }
}
