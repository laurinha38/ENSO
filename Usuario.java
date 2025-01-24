import java.util.*;
public class Usuario {
    Scanner leitura = new Scanner(System.in);
    private String nome, cpf, rg, dataNasci, email, senhaAcesso, loginAcesso;
    private ArrayList<String> usuarios = new ArrayList<String>();
    
    private String novaSenha;
    private String senha, login;
    
    public Usuario() {
        System.out.println("\nCADASTRANDO DADOS");
        System.out.println("Nome completo: ");
        nome = leitura.nextLine();
        System.out.println("CPF: ");
        cpf = leitura.nextLine();
        System.out.println("RG: ");
        rg = leitura.nextLine();
        System.out.println("Data de Nascimento: ");
        dataNasci = leitura.nextLine();
        System.out.println("Email: ");
        email = leitura.nextLine();
        System.out.println("Login: ");
        loginAcesso = leitura.nextLine();
        System.out.println("Senha: ");
        senhaAcesso = leitura.nextLine(); 
    }
    
    public void EfetuarLogin() {
        System.out.println("\nEFETUANDO LOGIN");
        System.out.println("Login: ");
        login = leitura.nextLine();
        System.out.println("Senha: ");
        senha = leitura.nextLine();
    }
    
    public void desativarConta() {
        System.out.println("\nDESATICANDO CONTA");
        System.out.println("Qual o login do usuário? ");
        login = leitura.nextLine();
        System.out.println("Qual é a senha do usuário? ");
        senha = leitura.nextLine();
    }
    
    public void mudarSenha() {
        System.out.println("Qual o login do usuário? ");
        login = leitura.nextLine();
        System.out.println("Qual é a senha do usuário? ");
        senha = leitura.nextLine();
        System.out.println("Qual a nova senha? ");
        novaSenha = leitura.nextLine();
    }

    public Scanner getLeitura() {
        return leitura;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getDataNasci() {
        return dataNasci;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getLogin() {
        return login;
    }

    public ArrayList<String> getUsuarios() {
        return usuarios;
    }

    public String getNovaSenha() {
        return novaSenha;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public String getLoginAcesso() {
        return loginAcesso;
    }
}