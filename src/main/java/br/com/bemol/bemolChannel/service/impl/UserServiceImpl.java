package br.com.bemol.bemolChannel.service.impl;

import br.com.bemol.bemolChannel.model.Usuario;
import br.com.bemol.bemolChannel.repository.UsuarioRepository;
import br.com.bemol.bemolChannel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UsuarioRepository userRepository;

    @org.springframework.transaction.annotation.Transactional
    @Override
    public Usuario save(Usuario user) {
        return userRepository.save(user);
    }

}
