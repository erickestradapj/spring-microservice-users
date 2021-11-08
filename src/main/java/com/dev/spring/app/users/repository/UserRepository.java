package com.dev.spring.app.users.repository;

import com.dev.spring.app.commons.users.models.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

//    User findByUsername(String username);

    @RestResource(path = "search-name")
    User findByUsername(@Param(value = "username") String username);

    @Query("SELECT u FROM User u WHERE u.username=?1")
    User getByUsername(String username);
}
