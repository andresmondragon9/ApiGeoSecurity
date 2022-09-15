package co.mil.ejercito.apigeoseguridad.dominio.service;

import co.mil.ejercito.apigeoseguridad.dominio.dto.UserAuthenticationDto;

public interface UserAuthenticationService {

    UserAuthenticationDto crearUserAuthetication(UserAuthenticationDto userAuthenticationDto);
}
