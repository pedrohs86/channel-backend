package br.com.bemol.bemolChannel.controller;

import br.com.bemol.bemolChannel.model.Usuario;
import br.com.bemol.bemolChannel.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {

    @Autowired
    UserService userService;

    @PostMapping()
    public Usuario saveUser(@RequestBody Usuario entity) {
        Usuario userSaved = userService.save(entity);
        return userSaved;
    }


}
