package Calculadora;

public class Divisao implements OperaçãoMatematica {

    private final double numero1;
    private final double numero2;

    public Divisao(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        try {
            return "Divisão de " + numero1 + " / " + numero2 + " = " + calcular();
        } catch (Exception e) {
            throw new RuntimeException("Não é possivel divisão por valor menor ou igual a 0");
        }
    }

    @Override
    public double calcular() throws Exception{
        if (numero2 > 0) {
            return numero1 / numero2;
        }
        throw new Exception("Não é possivel divisão por valor menor ou igual a 0");
    }
}