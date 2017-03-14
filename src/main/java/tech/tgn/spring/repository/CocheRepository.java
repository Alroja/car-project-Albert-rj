package tech.tgn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.tgn.spring.model.Coche;


@Repository
public interface CocheRepository extends JpaRepository<Coche, Integer> {
		
}
