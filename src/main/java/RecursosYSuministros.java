public class RecursosYSuministros {
    private double resursoVital;
    private double consumoDiario;

    public RecursosYSuministros(double recursoVital, double consumoDiario) {
        this.resursoVital = recursoVital;
        this.consumoDiario = consumoDiario;
    }

    public double[] calcularConsumoYPredicción (int dias) {
        double[] resultado = new double[2];
        resultado[0] = consumoDiario * dias;
        resultado[1] = resursoVital - resultado[0];
        return resultado;
    }
}
