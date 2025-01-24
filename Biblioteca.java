import java.util.*;
public class Biblioteca {
    Scanner leitura = new Scanner(System.in);
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private ArrayList<Livro> emprestimos = new ArrayList<Livro>();
    
    private Usuario usuario;
    private Livro livro;
    
    private int resp;
    private String tituloEmp, dataEmpr, tituloRen, tituloDev, l, s;
    
    public void cadastrarUsuario() {
        do {
            usuario = new Usuario();
            usuarios.add(usuario);
            
            System.out.println("Cadatrar outro usuário? [1] Sim; [2] Não: ");
            resp = leitura.nextInt();
        } while(resp != 2);
    }
    
    public void efetuarLogin() {
        if(usuarios.size() != 0) {
            usuario.EfetuarLogin();
            for(int i = 0; i < usuarios.size(); i++) {
                l = usuarios.get(i).getLogin();
                s = usuarios.get(i).getSenha();
            
                if(l.equalsIgnoreCase(usuario.getLoginAcesso()) && s.equalsIgnoreCase(usuario.getSenhaAcesso())) {
                    menuOpcoes();
                }
                else {
                    System.out.println("\nUsuário ou senha incorreto! ");
                }
            }
        } 
        else {
            System.out.println("\nNão existem usuarios e logins cadastrados!");
        }
    }
    
    public void menuOpcoes() {
        do {
            System.out.println("\nMENU DE OPÇÕES");
            System.out.println("[1] Catalogar livros");
            System.out.println("[2] Emprestar exemplar");
            System.out.println("[3] Controlar histórico");
            System.out.println("[4] Renovar empréstimos");
            System.out.println("[5] Devolver exemplar");
            System.out.println("[6] Desativar conta");
            System.out.println("[7] Mudar senha da conta");
            System.out.println("[8] Cadatrar usuario");
            System.out.println("[0] Sair");
            System.out.println("Informe sua escolha: ");
            resp = leitura.nextInt();
            
            if(resp == 1) {
                catalogarLivros();
            }
            
            else if(resp == 2) {
                emprestarExemplar();
            }
            
            else if(resp == 3) {
                controlarHistorico();
            }
            
            else if(resp == 4) {
                renovarEmprestimos();
            }
            
            else if(resp == 5) {
                devolverExemplar();
            }
            
            else if(resp == 6) {
                usuario.desativarConta();
            }
            
            else if(resp == 7) {
                usuario.mudarSenha();
            }
            
            else if(resp == 8) {
                cadastrarUsuario();
            }   
        } while(resp != 0);
    }
    
    public void catalogarLivros() {
        do {
            livro = new Livro();
            livros.add(livro);
            
            System.out.println("Catalogar outro livro? [1] Sim; [2] Não: ");
            resp = leitura.nextInt();
        } while(resp != 2);
    }
    
    public void emprestarExemplar() {
        System.out.println("\nEMPRESTANDO LIVRO");
        System.out.println("Qual o título do livro desejado? ");
        tituloEmp = leitura.nextLine();
        tituloEmp = leitura.nextLine();
        
        for(int i = 0; i < livros.size(); i++) {
            if(livros.get(i).getTitulo().equalsIgnoreCase(tituloEmp)) {
                if(livros.get(i).getSituacao() == true) {
                    System.out.println("O emprestimo do exemplar foi concluido! Você tem 14 dias! ");
                    livros.get(i).setSituacao(false);
                    emprestimos.add(livros.get(i));
                }
                else {
                    System.out.println("O livro não pode ser emprestado!");
                }
            }
        }
    }
    
    public void controlarHistorico() {
        for(int i = 0; i < emprestimos.size(); i++) {
            emprestimos.get(i).exibirLivro();
            // mensagem de sem empréstimos (caso n tenha)
        }
    }
    
    public void renovarEmprestimos() {
        System.out.println("\nRENOVANDO EMPRESTIMO");
        System.out.println("Qual o nome do livro que você deseja renovar? ");
        tituloRen = leitura.nextLine();
        tituloRen = leitura.nextLine();
        
        for(int i = 0; i < emprestimos.size(); i++) {
            if(emprestimos.get(i).getTitulo().equalsIgnoreCase(tituloRen)) {
               System.out.println("A data de empréstimo já se venceu? [True / False]");
               boolean resp = leitura.nextBoolean();
               
               if(resp == false) {
                   System.out.println("\nSeu empréstimo foi renovado com sucesso, para mais 14 dias!");
               }
               else if(resp == true){
                   System.out.println("\nNão é possível renovar seu empréstimo, pois ele está pendente! \nVocê precisa devolver!");
               }
            }
            else {
                System.out.println("\nEsse livro não está nos seus empréstimos!");
            }
        }
    }
    
    public void devolverExemplar() {
        System.out.println("\nDEVOLVENDO EXEMPLAR");
        System.out.println("Qual o livro para devolução? ");
        tituloDev = leitura.nextLine();
        tituloDev = leitura.nextLine();
        
        for(int i = 0; i < emprestimos.size(); i++) {
            if(emprestimos.get(i).getTitulo().equalsIgnoreCase(tituloDev)) {
                emprestimos.remove(i);
                System.out.println("\nLivro devolvido com sucesso! ");
            }
            else {
                System.out.println("\nEsse livro não está nos seus empréstimos! ");
            }
        }
    }
    
    public void desativarConta() {
        usuario.desativarConta();
        
        for(int i = 0; i < usuarios.size(); i++) {
            l = usuarios.get(i).getLogin();
            s = usuarios.get(i).getSenha();
            if(l.equalsIgnoreCase(usuario.getLoginAcesso()) && s.equalsIgnoreCase(usuario.getSenhaAcesso())) {
                usuarios.remove(i);
                System.out.println("\nConta desativada com sucesso! ");
                // voltar para a principal
            }
        }
    }
}