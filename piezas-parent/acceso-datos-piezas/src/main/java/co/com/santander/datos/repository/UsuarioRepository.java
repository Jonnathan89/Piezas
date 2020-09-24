package co.com.santander.datos.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.santander.datos.entity.Usuario;



@Repository
@Transactional(readOnly = true)
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	
	@Query(" select u from Usuario u where u.username = :username and u.password = :password ")
	public Usuario findByUsernamePass(@Param("username")String username ,@Param("password") String password );	
	
	@Query(" select u from Usuario u where u.username = :username ")
	public Usuario findByUsername(@Param("username")String username);
	
	@Query(" select u from Usuario u where u.typeuser = :typeuser")
	public List<Usuario> lstUsuario(@Param("typeuser") String typeuser);
	
}
