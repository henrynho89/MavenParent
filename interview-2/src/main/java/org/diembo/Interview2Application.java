package org.diembo;

import java.util.List;
import java.util.Optional;

import org.diembo.dao.AbonnementRepository;
import org.diembo.dao.IndividuRepository;
import org.diembo.entities.Abonnement;
import org.diembo.entities.Individu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Interview2Application implements CommandLineRunner{
	@Autowired
	IndividuRepository individuRepository;
	@Autowired
	AbonnementRepository abonnementRepository;

	public static void main(String[] args) {
		SpringApplication.run(Interview2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Abonnement abonnement = new Abonnement();
		abonnement.setId(1L);
		abonnementRepository.save(abonnement);
		Individu individu = new Individu();
		individu.setAbonnement(abonnement);
		individuRepository.save(individu);
		individu = new Individu();
		individu.setAbonnement(abonnement);
		individuRepository.save(individu);
		abonnement = new Abonnement();
		abonnement.setId(2L);
		abonnementRepository.save(abonnement);
		individu = new Individu();
		individu.setAbonnement(abonnement);
		individuRepository.save(individu);
		
		List<Individu> ind = individuRepository.findByAbonnement(abonnement);
		ind.forEach(i->{
			System.err.println(i.getAbonnement().getId());
		});
		
	}

}
