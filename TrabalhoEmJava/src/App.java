import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int op;

        Scanner scanner = new Scanner(System.in);

        Tabela tabela = new Tabela();

        Votos votos = new Votos();

        tabela.tabelaSenador();
        System.out.println();
        tabela.tabelaPresidente();
        
        //codigo provisorio para teste das somas do voto.
        for(int i =0;i<3;i++){
            System.out.print("opção: ");
            op = scanner.nextInt();
        switch(op){
            case 1-> {
             votos.somaAge();
            }
        }

        System.out.println(votos.getAge());
    
        }
    }
}
