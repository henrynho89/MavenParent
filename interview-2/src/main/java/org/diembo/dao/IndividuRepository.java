package org.diembo.dao;

import java.util.List;
import java.util.Optional;

import org.diembo.entities.Abonnement;
import org.diembo.entities.Individu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividuRepository extends JpaRepository<Individu, Long>{

	public List<Individu> findByAbonnement(Abonnement abonnement);
}
