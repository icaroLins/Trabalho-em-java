import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int totalVotosNullPre;
        int totalVotosBranPre;
        int totalVotosBranSen;
        int totalVotosNullSen;
        int totalValidSen;
        int totalValidPres;
        double percentNullPre;
        double percentBranPre;
        double percentNUllSen;
        double percentBranSen;

        Scanner scanner = new Scanner(System.in);

        Tabela tabela = new Tabela();

        Votos votos = new Votos();

        boolean continuar = true;
        while (continuar) {
            tabela.tabelaSenador();
            System.out.println();
            System.out.println("Digite dois números para Senador (0 = BRANCO).");

            System.out.print("Senador 1: ");
            String s1 = scanner.hasNextLine() ? scanner.nextLine().trim() : "";
            int sen1;

            // Evitar que o programa pare de funcionar caso o usuário digite algo que não seja número.
            try {
                sen1 = Integer.parseInt(s1);
            } catch (Exception e) {
                sen1 = Integer.MIN_VALUE;
            }
            if (sen1 == 0) {
                votos.somaBrancoSen();
            } else {
                switch (sen1) {
                    case 150 -> votos.somaAge();
                    case 500 -> votos.somaFab();
                    case 444 -> votos.somaJor();
                    case 405 -> votos.somaLuc();
                    case 135 -> votos.somaLui();
                    case 456 -> votos.somaMar();
                    case 290 -> votos.somaAle();
                    case 131 -> votos.somaGel();
                    case 210 -> votos.somaMag();
                    case 510 -> votos.somaPir();
                    case 111 -> votos.somaVan();
                    case 251 -> votos.somaWil();
                    default -> votos.somaNuloSen();
                }
            }

            System.out.print("Senador 2: ");
            String s2 = scanner.hasNextLine() ? scanner.nextLine().trim() : "";
            int sen2;

            //Evitar que o programa pare de funcionar caso o usuário digite algo que não seja número.
            try {
                sen2 = Integer.parseInt(s2);
            } catch (Exception e) {
                sen2 = Integer.MIN_VALUE;
            }
            if (sen2 == 0) {
                votos.somaBrancoSen();
            } else {
                boolean sen1Valido = (sen1 == 150 || sen1 == 500 || sen1 == 444 || sen1 == 405 || sen1 == 135
                        || sen1 == 456 || sen1 == 290 || sen1 == 131 || sen1 == 210 || sen1 == 510 || sen1 == 111
                        || sen1 == 251);
                if (sen2 == sen1 && sen1Valido) {
                    System.out.println("Voto repetido para Senador. Contado como NULO.");
                    votos.somaNuloSen();
                } else {
                    switch (sen2) {
                        case 150 -> votos.somaAge();
                        case 500 -> votos.somaFab();
                        case 444 -> votos.somaJor();
                        case 405 -> votos.somaLuc();
                        case 135 -> votos.somaLui();
                        case 456 -> votos.somaMar();
                        case 290 -> votos.somaAle();
                        case 131 -> votos.somaGel();
                        case 210 -> votos.somaMag();
                        case 510 -> votos.somaPir();
                        case 111 -> votos.somaVan();
                        case 251 -> votos.somaWil();
                        default -> votos.somaNuloSen();
                    }
                }
            }

            System.out.println();
            tabela.tabelaPresidente();
            System.out.print("Digite o número do seu candidato à Presidência (0 = BRANCO): ");
            String p1 = scanner.hasNextLine() ? scanner.nextLine().trim() : "";
            int pres1;

            //Evitar que o programa pare de funcionar caso o usuário digite algo que não seja número.
            try {
                pres1 = Integer.parseInt(p1);
            } catch (Exception e) {
                pres1 = Integer.MIN_VALUE;
            }
            if (pres1 == 0) {
                votos.somaBrancoPres();
            } else {
                switch (pres1) {
                    case 17 -> votos.somaBol();
                    case 13 -> votos.somaHad();
                    case 12 -> votos.somaCir();
                    case 50 -> votos.somaBou();
                    case 51 -> votos.somaDac();
                    case 18 -> votos.somaMsi();
                    case 45 -> votos.somaAlc();
                    case 19 -> votos.somaDia();
                    case 15 -> votos.somaMei();
                    case 30 -> votos.somaAmo();
                    default -> votos.somaNuloPres();
                }
            }

            System.out.println("\n===== RESULTADOS SENADOR =====");
            System.out.println("Agenor: " + votos.getAge());
            System.out.println("Fabricio Rosa: " + votos.getFab());
            System.out.println("Jorge Kajuru: " + votos.getJor());
            System.out.println("Lúcia Vânia: " + votos.getLuc());
            System.out.println("Luis Cesar Bueno: " + votos.getLui());
            System.out.println("Marconi Perollo: " + votos.getMar());
            System.out.println("Prof. Alessandro Aquino: " + votos.getAle());
            System.out.println("Professora Geli: " + votos.getGel());
            System.out.println("Profª Magda Borges: " + votos.getMag());
            System.out.println("Santana Pires: " + votos.getPir());
            System.out.println("Vanderlan: " + votos.getVan());
            System.out.println("Wilder Morais: " + votos.getWil());
            System.out.println("Nulos: " + votos.getNulosSen());
            System.out.println("Brancos: " + votos.getBrancosSen());

            totalValidSen = votos.getTotalValidSen();

            totalVotosNullSen = votos.getNulosSen();

            totalVotosBranSen = votos.getBrancosSen();

            percentNUllSen = totalValidSen > 0 ? votos.Percent(totalVotosNullSen, totalValidSen) : 0.0;
            percentBranSen = totalValidSen > 0 ? votos.Percent(totalVotosBranSen, totalValidSen) : 0.0;

            System.out.printf("%% Nulos sobre válidos: %.2f%%%n", percentNUllSen);
            System.out.printf("%% Brancos sobre válidos: %.2f%%%n", percentBranSen);

            System.out.println("\n===== RESULTADOS PRESIDENTE =====");
            System.out.println("Bolsonaro: " + votos.getBol());
            System.out.println("Haddad: " + votos.getHad());
            System.out.println("Ciro: " + votos.getCir());
            System.out.println("Boulos: " + votos.getBou());
            System.out.println("Cabo Daciolo: " + votos.getDac());
            System.out.println("Marina Silva: " + votos.getMsi());
            System.out.println("Geraldo Alckmin: " + votos.getAlc());
            System.out.println("Álvaro Dias: " + votos.getDia());
            System.out.println("Henrique Meirelles: " + votos.getMei());
            System.out.println("João Amoedo: " + votos.getAmo());
            System.out.println("Nulos: " + votos.getNulosPres());
            System.out.println("Brancos: " + votos.getBrancosPres());

            totalValidPres = votos.getTotalValidPres();

            totalVotosNullPre = votos.getNulosPres();
            totalVotosBranPre = votos.getBrancosPres();

            percentBranPre = totalValidPres > 0 ? votos.Percent(totalVotosBranPre, totalValidPres) : 0.0;
            percentNullPre = totalValidPres > 0 ? votos.Percent(totalVotosNullPre, totalValidPres) : 0.0;

            System.out.printf("%% Nulos sobre válidos: %.2f%%%n", percentNullPre);
            System.out.printf("%% Brancos sobre válidos: %.2f%%%n", percentBranPre);

            System.out.print("Deseja continuar a votação? (S/N): ");
            String resp = scanner.nextLine().trim().toUpperCase();

            if (!resp.equals("S")) {
                continuar = false;
            }
        }

        scanner.close();
    }
}