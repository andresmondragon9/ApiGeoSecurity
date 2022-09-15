package co.mil.ejercito.apigeoseguridad.dominio.serviceImpl;

import co.mil.ejercito.apigeoseguridad.dominio.dto.UserAuthenticationDto;
import co.mil.ejercito.apigeoseguridad.dominio.service.UserAuthenticationService;
import co.mil.ejercito.apigeoseguridad.persistencia.dao.UserAutheticationDao;
import co.mil.ejercito.apigeoseguridad.persistencia.entity.UserAutentication;
import co.mil.ejercito.apigeoseguridad.persistencia.repository.UserAutenticacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {

    @Autowired
    private UserAutenticacionRepository userAutenticacionRepository;

    @Autowired
    private UserAutheticationDao userAutheticationDao;

    @Override
    public UserAuthenticationDto crearUserAuthetication(UserAuthenticationDto userAuthenticationDto) {
        UserAutentication userAutentication = userAutheticationDao.userAuthenticationDtoToUserAutheticationToEncritpPassword(userAuthenticationDto);
        userAutenticacionRepository.save(userAutentication);
        return null;
    }
}
