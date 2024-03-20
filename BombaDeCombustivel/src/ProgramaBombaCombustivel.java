public class ProgramaBombaCombustivel {

    private static int opcao = 0;

    private static String lerEntrada() {
        String entrada = "";
        switch (opcao) {
            case 1:
            case 2:
            case 4:
                entrada = "Gasolina"; // valor padrão para o tipo de combustível
                break;
            case 3:
                entrada = "5.50"; // valor padrão para o novo valor do litro
                break;
            case 5:
                entrada = "1000"; // valor padrão para a nova quantidade de combustível
                break;
        }
        opcao++;
        return entrada;
    }

    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.50, 1000);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Abastecer por valor");
            System.out.println("2. Abastecer por litro");
            System.out.println("3. Alterar valor do litro");
            System.out.println("4. Alterar tipo de combustível");
            System.out.println("5. Mostrar quantidade total abastecida");
            System.out.println("6. Sair");

            // Simulando a entrada do usuário
            String input = lerEntrada();

            switch (opcao) {
                case 1:
                    double valor = Double.parseDouble(input);
                    bomba.abastecerPorValor(valor);
                    break;
                case 2:
                    double litros = Double.parseDouble(input);
                    bomba.abastecerPorLitro(litros);
                    break;
                case 3:
                    double novoValor = Double.parseDouble(input);
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    bomba.alterarCombustivel(input);
                    break;
                case 5:
                    double novaQuantidade = Double.parseDouble(input);
                    bomba.alterarQuantidadeCombustivel(novaQuantidade);
                    break;
                case 6:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}