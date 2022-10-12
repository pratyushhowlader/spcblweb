package spcbl.org.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import spcbl.org.inventory.model.Users;

public interface UserRepo extends CrudRepository <Users,Integer> {
  /*  @Query("SELECT u.username FROM Users u WHERE u.username = :username")*/
    public Users getUserByUsername(@Param("username") String username);
}
