package ir.legocode.jpa04.repository;

import ir.legocode.jpa04.base.repository.BaseEntiiyRepositoryImpl;
import ir.legocode.jpa04.base.repository.BaseEntityRepository;
import ir.legocode.jpa04.domain.User;
import javax.persistence.EntityManager;


public class UserRepositoryImpl extends BaseEntiiyRepositoryImpl<User, Long> implements UserRepository {


    public UserRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }
}
