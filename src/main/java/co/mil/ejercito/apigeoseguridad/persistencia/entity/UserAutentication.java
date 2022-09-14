package co.mil.ejercito.apigeoseguridad.persistencia.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_autentication")
public class UserAutentication {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer idUser;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

}
