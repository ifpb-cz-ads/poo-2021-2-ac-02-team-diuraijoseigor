public class BMExercio03 {
    
    public static void main(String[] args){

        final float taxa = 8.25f % 100f;
        float arroz = 2.95f;
        float feijao = 3.50f;

        System.out.println("o arroz custa " + arroz + " e o feijao  custa " + feijao);

        float precoTotal = arroz + feijao;

        System.out.println("Preco total dos dois produtos e " + precoTotal);

        float taxaCalculada = precoTotal * taxa / 100;

        System.out.println("Valor da taxa sobre o produto e " + taxaCalculada);

        arroz += taxaCalculada;
        feijao += taxaCalculada;
        float novoCusto = arroz + feijao; 
       
        boolean muitoCaro = novoCusto => 10;

        System.out.println("O novo custo do produto e " + novoCusto);

        
        
    }

}
