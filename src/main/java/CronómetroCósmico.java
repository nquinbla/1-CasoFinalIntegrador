public class CronómetroCósmico {
    private double cicloDiarioPlaneta; // para ciclo diario (en días)
    private double cicloAnualPlaneta; // para ciclo anual (en años)

    public CronómetroCósmico(double cicloDiarioPlaneta, double cicloAnualPlaneta) {
        this.cicloDiarioPlaneta = cicloDiarioPlaneta;
        this.cicloAnualPlaneta = cicloAnualPlaneta;
    }

    public double convertirTiempoTierraANuevoPlaneta(double tiempoTierra, boolean esCicloDiario) {
        double factorConversion = esCicloDiario ? cicloDiarioPlaneta / 24 : cicloAnualPlaneta / 365.25;
        double resultado = tiempoTierra * factorConversion;
        if (resultado > Double.MAX_VALUE || resultado < Double.MIN_VALUE) {
            throw new IllegalArgumentException("El resultado excede los límites de representación de datos.");
        }
        return resultado;
    }



}
