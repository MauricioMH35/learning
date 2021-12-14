package org.learning.crud.repositories;

import org.learning.crud.entities.Crud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<Crud, Long> {
}
