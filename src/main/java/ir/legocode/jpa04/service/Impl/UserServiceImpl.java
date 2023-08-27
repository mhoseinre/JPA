package ir.legocode.jpa04.service.Impl;

import ir.legocode.jpa04.base.service.BasrEntityServiceImpl;
import ir.legocode.jpa04.domain.User;
import ir.legocode.jpa04.repository.UserRepository;
import ir.legocode.jpa04.service.UserService;

import javax.persistence.EntityManager;

public class UserServiceImpl extends BasrEntityServiceImpl<User, Long, UserRepository> implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public EntityManager getEntityManager() {
        return null;
    }
}
