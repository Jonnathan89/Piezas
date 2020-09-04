package co.com.santander.datos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.santander.datos.entity.MuebleAccesorio;

@Transactional(readOnly = true)
@Repository
public interface MuebleAccesorioRepository extends JpaRepository<MuebleAccesorio, Integer> {

	
	
}
