import java.util.Scanner;

public class SistemaIncidentes {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("=== SISTEMA DE INCIDENTES DE CIBERSEGURANCA ===");
            System.out.println("1 - Phishing");
            System.out.println("2 - Ransomware");
            System.out.print("Escolha o tipo de incidente: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Titulo do incidente: ");
            String titulo = scanner.nextLine();

            System.out.print("Sistema afetado: ");
            String sistemaAfetado = scanner.nextLine();

            System.out.print("Nivel de severidade (1 a 5): ");
            int nivelSeveridade = scanner.nextInt();

            System.out.print("Prejuizo estimado: R$ ");
            double prejuizoEstimado = scanner.nextDouble();
            scanner.nextLine();

            IncidenteSeguranca incidente;

            if (opcao == 1) {

                System.out.print("Quantidade de usuarios afetados: ");
                int usuariosAfetados = scanner.nextInt();

                System.out.print("Houve credenciais comprometidas? (true/false): ");
                boolean credenciaisComprometidas = scanner.nextBoolean();

                incidente = new Phishing(
                        titulo,
                        sistemaAfetado,
                        nivelSeveridade,
                        prejuizoEstimado,
                        usuariosAfetados,
                        credenciaisComprometidas
                );

            } else if (opcao == 2) {

                System.out.print("Quantidade de dados criptografados em GB: ");
                double dadosCriptografadosGB = scanner.nextDouble();

                System.out.print("Valor do resgate: R$ ");
                double valorResgate = scanner.nextDouble();

                incidente = new Ransomware(
                        titulo,
                        sistemaAfetado,
                        nivelSeveridade,
                        prejuizoEstimado,
                        dadosCriptografadosGB,
                        valorResgate
                );

            } else {
                System.out.println("Opcao invalida.");
                scanner.close();
                return;
            }

            System.out.println();
            System.out.println("=== DADOS DO INCIDENTE ===");

            incidente.exibirInformacoes();

            System.out.println();
            System.out.println("=== CALCULO DE RISCO ===");

            System.out.println("Risco padrao: " +
                    incidente.calcularNivelRisco());

            System.out.println("Risco com fator de impacto 1.5: " +
                    incidente.calcularNivelRisco(1.5));

            System.out.println("Risco com impacto 1.5 e urgencia 1.2: " +
                    incidente.calcularNivelRisco(1.5, 1.2));

            scanner.close();

        }

}
