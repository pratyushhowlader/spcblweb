package spcbl.org.bd.osp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spcbl.org.bd.osp.model.Users;

public interface UserRepo extends CrudRepository <Users,Integer> {
  /*  @Query("SELECT u.username FROM Users u WHERE u.username = :username")*/
    public Users getUserByUsername(@Param("username") String username);
}
