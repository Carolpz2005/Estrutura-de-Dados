import java.util.Random;

public class Atividade06E {
    Random gerador = new Random();
    int escolha;
    int p1 = 0;
    int p2 = 0;
    int posicao = 0;
    int[] vet3;


    public int[] sorteio(int[] vet1, int[] vet2) throws Exception{
        while ((posicao < vet1.length) && (posicao < vet2.length)) {
            vet3 = new int[vet1.length];

            escolha = gerador.nextInt(100);
            System.out.println("A escolha foi " + escolha);

            if (escolha % 2 == 0) {
                vet3[p1] = vet1[p1++];

            }

            else{
                vet3[p2] = vet2[p2++];
            }

            posicao++;

        }

        return vet3;

    }

    public static void main(String[] args) {
        Atividade06E atividade06e = new Atividade06E();

        int [] vet1 = {11, 22, 33, 99};
        int [] vet2 = {1, 7, 3, 18};


        try{
            int [] vet3 = atividade06e.sorteio(vet1, vet2);
            for(int i = 0; i < vet3.length; i++){
                System.out.println(vet3[i]);
            }

        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }
    }

}
