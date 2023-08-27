package ir.legocode.jpa04.service;

import ir.legocode.jpa04.base.service.BaseEntityService;
import ir.legocode.jpa04.domain.User;

import javax.persistence.EntityManager;
import java.util.List;

public interface UserService  extends BaseEntityService<User, Long> {
    @Override
    User save(User user);

    @Override
    User update(User user);

    @Override
    User saveOrUpdate(User user);

    @Override
    User findById(Long aLong);

    @Override
    List<User> findAll();

    @Override
    void delete(User user);

    @Override
    boolean exsistsById(Long aLong);

    @Override
    Long countAll();

    @Override
    EntityManager getEntityManager();
}
