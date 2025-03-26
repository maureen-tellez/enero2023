package com.mayab.desarrollo.servicio;

import com.mayab.desarrollo.entities.Usuario;
import com.mayab.desarrollo.persistence.UserDAO;

public class LoginServicio {
     private UserDAO userDao;

    public LoginServicio(UserDAO userDao) {
        this.userDao = userDao;
    }

    public int createUser(String nombre, String password, String email) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setPassword(password);
        usuario.setEmail(email);
        usuario.setId(userDao.createUser(usuario));
        return usuario.getId();

    }

    
}
