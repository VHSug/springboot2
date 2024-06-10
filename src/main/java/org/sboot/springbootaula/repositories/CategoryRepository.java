package org.sboot.springbootaula.repositories;


import org.sboot.springbootaula.entities.Category;
import org.sboot.springbootaula.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
