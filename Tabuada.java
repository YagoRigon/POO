/*0050015850 - Yago Felippe Rigon*/

public class Tabuada {
    public static void main(String[] args) {
        int i=1, resultado = 0, x=10;

        System.out.println("Tabuada de " + x);
        while(i <=10 )
        {
            resultado = 0;
            resultado = x * i;
            System.out.print("10 x " +i + " " + "=");
            System.out.println(" "+resultado);
            i++;
        }
    }
}
