class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Foram abastecidos " + litrosAbastecidos + " litros de " + tipoCombustivel);
        } else {
            System.out.println("Não há combustível suficiente na bomba para este valor.");
        }
    }

    public void abastecerPorLitro(double litros) {
        double valorPagar = litros * valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("O valor a pagar é: R$" + valorPagar);
        } else {
            System.out.println("Não há combustível suficiente na bomba para esta quantidade.");
        }
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoCombustivel) {
        this.tipoCombustivel = novoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}
