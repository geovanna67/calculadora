class Calculadora{
    public static int soma (int a , int b){
        return a+b;
    }
    public static int subtracao (int a , int b){
        return a-b;
    }
    public static void main(String[] args) {
        System.out.println("Resultado soma: " +  soma (5,3));
        System.out.println("Resultado subtração: " + subtracao(5,3));
    }
}
