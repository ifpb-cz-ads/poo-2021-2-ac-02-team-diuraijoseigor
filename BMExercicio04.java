public class BMExercicio04 {
    public static void main(String[] args){
        long long1 = 100;
        int int1 = 200;
        //int int2 = int1 + long1; Nesse caso dá erro pois não é possível atribuir uma variável de um tipo maior para uma menor. A maneira certa seria para realizar essa operação seria:
        int int2 = (int) (int1 + long1);
        System.out.println(int2);
    }
}