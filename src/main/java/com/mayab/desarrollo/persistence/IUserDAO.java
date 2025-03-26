package com.mayab.desarrollo.persistence;

import java.util.List;

import com.mayab.desarrollo.entities.Usuario;

public interface IUserDAO {

    public List<Usuario> findAll();

    public int createUser(Usuario usuario);

    public Usuario findById(int id);

    public boolean deleteUser(int id);

    public Usuario findByName(String nombre);

    public Usuario updatePass(Usuario usuario, String newPass);

    public Usuario findByEmail(String email);
    

    
}
