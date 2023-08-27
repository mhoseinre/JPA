package ir.legocode.jpa04.base.repository;

import ir.legocode.jpa04.base.models.BaseEntity;


import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public abstract class BaseEntiiyRepositoryImpl<E extends BaseEntity<ID>, ID extends Serializable> implements BaseEntityRepository<E, ID> {

    protected final EntityManager entityManager;

    public BaseEntiiyRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public abstract Class<E> getEntityClass();

//    example of overriding this method
//
//    public  Class<E> getEntityClass(){
//        return User.class;
//    };
//    public  Class<E> getEntityClass(){
//        return Student.class;
//    };


    @Override
    public E save(E e) {
        if (e.getId()==null){
             entityManager.persist(e);
            return e;
        } else return entityManager.merge(e);

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

        return entityManager.find(getEntityClass(), id);
    }

    @Override
    public List<E> findAll() {
//
//        return entityManager.createNamedQuery(getEntityClass()+".findAll").getResultList();
        return entityManager.createQuery("FROM" + getEntityClass().getSimpleName(),
                getEntityClass()).getResultList();
    }

    @Override
    public void delete(E e) {
        entityManager.remove(e);

    }

    @Override
    public boolean exsistsById(ID id) {
        return getEntityManager().createQuery("SELECT COUNT(id) from " + getEntityClass().getSimpleName() +
                "where id= :id", long.class).setParameter("id", id).getSingleResult() == 1l;
    }

    @Override
    public Long countAll() {
        return getEntityManager().createQuery(
                "select count (id) from " + getEntityClass().getSimpleName(), long.class
        ).getSingleResult();
    }
@Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
