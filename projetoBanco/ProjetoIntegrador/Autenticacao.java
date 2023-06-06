package ProjetoIntegrador;

import java.util.*;

public class Autenticacao {
    private HashMap<String, String> usuarios;

    public Autenticacao() {
        this.usuarios = new HashMap<>();
    }

    public void registrarUsuario(String nomeUsuario, String senha) {
        if (!usuarios.containsKey(nomeUsuario)) {
            usuarios.put(nomeUsuario, senha);
            System.out.println("Usuário registrado com sucesso!");
        } else {
            System.out.println("O nome de usuário já está em uso. Por favor, escolha outro nome de usuário.");
        }
    }

    public void login(String nomeUsuario, String senha) {
        if (usuarios.containsKey(nomeUsuario)) {
            if (usuarios.get(nomeUsuario).equals(senha)) {
                System.out.println("Login realizado com sucesso!");
            } else {
                System.out.println("Senha incorreta. Por favor, tente novamente.");
            }
        } else {
            System.out.println("O nome de usuário não existe. Por favor, registre-se primeiro.");
        }
    }

    public void recuperarSenha(String nomeUsuario) {
        if (usuarios.containsKey(nomeUsuario)) {
            String senha = usuarios.get(nomeUsuario);
            System.out.println("Sua senha é: " + senha);
        } else {
            System.out.println("O nome de usuário não existe. Por favor, registre-se primeiro.");
        }
    }

    public static void main(String[] args) {
        Autenticacao autenticacao = new Autenticacao();

        autenticacao.registrarUsuario("usuario1", "senha123");
        autenticacao.login("usuario1", "senha123");
        autenticacao.recuperarSenha("usuario1");
        autenticacao.login("usuario1", "senha errada!");
        autenticacao.registrarUsuario("ususario1", "novasenha.");
    }
}