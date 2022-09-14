package co.mil.ejercito.apigeoseguridad.persistencia.repository;

import co.mil.ejercito.apigeoseguridad.persistencia.entity.UserAutentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAutenticacionRepository extends JpaRepository<UserAutentication, Integer> {

    Optional<UserAutentication> findByUserName(String userName);
}
