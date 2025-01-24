import java.util.*;
public class Principal {
    public static void main(String a[]) {
        Scanner leitura = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int resp;
        
        do {
            System.out.println("\nBEM-VINDO AO SISTEMA DE BIBLIOTECA ONLINE! ");
            System.out.println("[1] Cadatrar novo usuario");
            System.out.println("[2] Efetuar login");
            System.out.println("[0] Sair");
            resp = leitura.nextInt();
            
            if(resp == 1) {
                biblioteca.cadastrarUsuario();
            }
            
            else if(resp == 2) {
                biblioteca.efetuarLogin();
            }
            
        } while(resp != 0);
    }
}