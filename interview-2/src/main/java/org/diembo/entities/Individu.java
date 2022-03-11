package org.diembo.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Individu {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne
  private Abonnement abonnement;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Abonnement getAbonnement() {
	return abonnement;
}

public void setAbonnement(Abonnement abonnement) {
	this.abonnement = abonnement;
}

  
}