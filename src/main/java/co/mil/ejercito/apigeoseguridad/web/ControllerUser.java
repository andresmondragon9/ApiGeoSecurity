package co.mil.ejercito.apigeoseguridad.web;


import co.mil.ejercito.apigeoseguridad.dominio.dto.UserAuthenticationDto;
import co.mil.ejercito.apigeoseguridad.dominio.service.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ControllerUser {

    @Autowired
    private UserAuthenticationService userAuthenticationService;

    @PostMapping("/crear")
    private void crearUser(@RequestBody UserAuthenticationDto userAuthenticationDto){
          userAuthenticationService.crearUserAuthetication(userAuthenticationDto);
    }
}
