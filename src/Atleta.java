public class Atleta extends Pessoa{
    private String esportePraticado;

    public Atleta() {

    }

    // Método para cálculo do IMC com redução de 5% para Atletas de Alto Nível
    @Override
    public double calcularIMC(){
        double imcNormal = super.calcularIMC();
        return imcNormal * 0.95;
    }



    // Getters and Setters
    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }

}
