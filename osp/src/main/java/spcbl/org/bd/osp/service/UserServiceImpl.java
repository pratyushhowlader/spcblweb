package spcbl.org.bd.osp.service;

import org.springframework.stereotype.Service;
import spcbl.org.bd.osp.model.User;
import spcbl.org.bd.osp.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User findUser(String username) {
        return this.userRepo.findByUsername(username);
    }
}
