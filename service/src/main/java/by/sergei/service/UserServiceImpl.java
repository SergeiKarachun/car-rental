package by.sergei.service;

import by.sergei.repository.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends CrudServiceJpaRepoImpl<User> implements UserService {
}
