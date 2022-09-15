package co.mil.ejercito.apigeoseguridad.dominio.serviceImpl;

import co.mil.ejercito.apigeoseguridad.persistencia.entity.UserAutentication;
import co.mil.ejercito.apigeoseguridad.persistencia.repository.UserAutenticacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserAutenticacionRepository userAutenticacionRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserAutentication> userAutentication = userAutenticacionRepository.findByUserName(username);
        if(userAutentication.isPresent()){
            return new User(userAutentication.get().getUserName(),userAutentication.get().getPassword(),new ArrayList<>()) ;
        }
        throw  new UsernameNotFoundException(username);
    }
}
