package spcbl.org.bd.osp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spcbl.org.bd.osp.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {
    public User findByUsername(String username);
}
