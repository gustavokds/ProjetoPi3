package br.com.bandtec.projeto02;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.io.IOException;
import java.util.ArrayList;


@RestController
@RequestMapping("/union")
public class LoginController {

    private Login login;
    private Boolean logado;
    private ArrayList<String> loginEmail = new ArrayList<>();
    private ArrayList<String> loginSenha = new ArrayList<>();

    @PostMapping("/cadastro")
    public void cadastro(@RequestParam String email, @RequestParam String senha) {
        loginEmail.add(email);
        loginSenha.add(senha);

        login.setEmail(loginEmail);
        login.setSenha(loginSenha);

    }

    @GetMapping("/login")
    @ResponseBody
    public String login(@RequestParam String email, @RequestParam String senha)
    {
        String mensagem = "";

        if (logado == true) {
            mensagem= "Você já esta logado";
        }
        else {
            for (String e : login.getEmail()) {
                if (e == email) {
                    for (String s : login.getSenha()) {
                        if (s == senha) {
                            mensagem = "Usuário logado com sucesso";
                            this.logado = true;
                        }
                    }
                } else {
                    mensagem = "Usuário ou email incorretos";
                }
            }
        }
        return mensagem;
    }

    @PostMapping("/logoff")
    public void logoff(){
        this.logado = false;
        String url_open ="localhost:8080";

    }
}
