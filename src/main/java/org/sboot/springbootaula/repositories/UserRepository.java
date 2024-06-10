package org.sboot.springbootaula.repositories;

import org.course.educandowebs.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
