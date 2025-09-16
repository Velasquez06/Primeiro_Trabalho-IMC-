public class Main{
    public static void main(String[] args){
        System.out.println();
        System.out.println("****************************************");
        // Implementação dos dados de uma pessoa para teste
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Artur Costa");
        pessoa.setAltura(1.70);
        pessoa.setPeso(70);

        System.out.println("O valor do IMC da pessoa "+ pessoa.getNome() +" é: "+  String.format("%.2f", + pessoa.calcularIMC()));

        // Implementação dos dados de uma atleta para teste
        Atleta atleta = new Atleta();
        atleta.setNome("Bianca Costa");
        atleta.setAltura(1.65);
        atleta.setPeso(65);
        atleta.setEsportePraticado("Natação");

        System.out.println("O IMC do(a) Atleta "+ atleta.getNome() +" que pratica "+ atleta.getEsportePraticado() + " é de " + String.format("%.2f", + atleta.calcularIMC()));
        System.out.println("****************************************");
    }
}