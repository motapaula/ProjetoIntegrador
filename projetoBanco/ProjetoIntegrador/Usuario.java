package ProjetoIntegrador;

public class Usuario extends Conta {
    private String nome;
    private String cpf;
    private String senha;

    public Usuario(String nome, String cpf, String senha) {
        this.nome = nome;
        this.senha = senha;

    }

    public void login(Usuario usuario, String senha) {
        if(usuario.senha == this.senha ){
            System.out.println("Login efetuado com sucesso!");
        }else{
            System.out.println("Usuario ou senha incorreto!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
        System.out.println("Depósito realizado por: " + nome);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        System.out.println("Saque realizado por: " + nome);
    }
}