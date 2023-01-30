package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    //hace que la calse se cree un objeto y la guarde en la variable de usuario Dao
@Autowired
    private UsuarioDao usuarioDao;
@RequestMapping(value = "api/usuario/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Jenifer");
        usuario.setApellido("Gómez");
        usuario.setEmail("Jenifer@gmail.com");
        usuario.setTelefono("3117996339");
        return usuario;
    }
    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios(){
    List<Usuario> usuarios = new ArrayList<>();
return usuarioDao.getUsuarios();
    }
    @RequestMapping(value = "usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jenifer");
        usuario.setApellido("Gómez");
        usuario.setEmail("Jenifer@gmail.com");
        usuario.setTelefono("3117996339");
        return usuario;
    }
    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
    usuarioDao.eliminar(id);
    }
    @RequestMapping(value = "usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jenifer");
        usuario.setApellido("Gómez");
        usuario.setEmail("Jenifer@gmail.com");
        usuario.setTelefono("3117996339");
        return usuario;
    }
}
