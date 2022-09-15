package co.mil.ejercito.apigeoseguridad.persistencia.dao;


import co.mil.ejercito.apigeoseguridad.dominio.dto.UserAuthenticationDto;
import co.mil.ejercito.apigeoseguridad.persistencia.entity.UserAutentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserAutheticationDao {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserAutentication userAuthenticationDtoToUserAutheticationToEncritpPassword(UserAuthenticationDto userAuthenticationDto){
        UserAutentication userAutentication = new UserAutentication();
        userAutentication.setUserName(userAuthenticationDto.getUserName());
        userAutentication.setPassword(bCryptPasswordEncoder.encode(userAuthenticationDto.getPassword()));
        return userAutentication;
    }
    public UserAutentication userAuthenticationDtoToUserAuthetication(UserAuthenticationDto userAuthenticationDto){
        UserAutentication userAutentication = new UserAutentication();
        userAutentication.setUserName(userAuthenticationDto.getUserName());
        userAutentication.setPassword(userAuthenticationDto.getPassword());
        return userAutentication;
    }

    public UserAuthenticationDto userAutenticationToUserAutheticationçDto(UserAutentication userAutentication){
        UserAuthenticationDto userAuthenticationDto = new UserAuthenticationDto();
        userAuthenticationDto.setUserName(userAutentication.getUserName());
        userAuthenticationDto.setPassword(userAuthenticationDto.getPassword());
        return userAuthenticationDto;
    }
}
