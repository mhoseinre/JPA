package ir.legocode.jpa04.utils;

import ir.legocode.jpa04.repository.Impl.UserRepositoryImpl;
import ir.legocode.jpa04.repository.UserRepository;
import ir.legocode.jpa04.service.Impl.UserServiceImpl;
import ir.legocode.jpa04.service.UserService;

import javax.persistence.EntityManager;

public class ApplicationContext {

    private static final UserRepository userRepository;
    private static final UserService userService;

    private ApplicationContext() {
    }

    static {
        EntityManager entityManager= HibernateUtil.getEntityManagerFactory().createEntityManager();
        userRepository=new UserRepositoryImpl(entityManager);
        userService = new UserServiceImpl(userRepository);
    }
}
