package br.com.bandtec.projeto02;

import java.util.ArrayList;

public abstract class Login {

    private ArrayList<String> email = new ArrayList<>();
    private ArrayList<String> senha = new ArrayList<>();

    public ArrayList<String> getEmail() {
        return email;
    }

    public void setEmail(ArrayList<String> email) {
        this.email = email;
    }

    public ArrayList<String> getSenha() {
        return senha;
    }

    public void setSenha(ArrayList<String> senha) {
        this.senha = senha;
    }
}
