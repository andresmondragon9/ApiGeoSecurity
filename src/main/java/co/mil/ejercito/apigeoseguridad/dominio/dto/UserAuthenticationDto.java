package co.mil.ejercito.apigeoseguridad.dominio.dto;

import lombok.Data;

@Data
public class UserAuthenticationDto {

    private String userName;

    private String password;
}
