package aula01;

public class Exemplo01 {
    public static void main(String[] args) {
        int [][] temperaturas = new int[10][2];
        int min = 0;
        int max = 0;
        int [] minValue = new int [temperaturas.length];
        int [] maxValue = new int [temperaturas.length];
        temperaturas[0][0] = -2;
        temperaturas[0][1] = 33;
        temperaturas[1][0] = -3;
        temperaturas[1][1] = 32;
        temperaturas[2][0] = -8;
        temperaturas[2][1] = 27;
        temperaturas[3][0] = 4;
        temperaturas[3][1] = 37;
        temperaturas[4][0] = 6;
        temperaturas[4][1] = 42;
        temperaturas[5][0] = 5;
        temperaturas[5][1] = 43;
        temperaturas[6][0] = 0;
        temperaturas[6][1] = 39;
        temperaturas[7][0] = -7;
        temperaturas[7][1] = 26;
        temperaturas[8][0] = -1;
        temperaturas[9][1] = 31;
        temperaturas[9][0] = -10;
        temperaturas[9][1] = 35;

        String[] cidades = new String[10];
        cidades[0] = "Londres";
        cidades[1] = "Madrid";
        cidades[2] = "Nueva Work";
        cidades[3] = "Buenos Aires";
        cidades[4] = "Asunción";
        cidades[5] = "São Paulo";
        cidades[6] = "Lima";
        cidades[7] = "Santiado de Chile";
        cidades[8] = "Lisboa";
        cidades[9] = "Tokio";

        int minCidadeIndex = 0;
        int maxCidadeIndex = 0;



        for(int i = 0; i<temperaturas.length;i++){

            for(int j =0; j<temperaturas[i].length; j++){
                if(temperaturas[i][j] < min){
                    min = temperaturas[i][j];
                    minCidadeIndex = i;
                }
                if(temperaturas[i][j] > max){
                    max = temperaturas[i][j];
                    maxCidadeIndex = i;
                }
                System.out.print(temperaturas[i][j] + " ");
                System.out.println(" ");

            }


        }
        System.out.printf("Mínimo: (%d): %s \n", min, cidades[minCidadeIndex]);
        System.out.printf("Máximo: (%d): %s \n", max, cidades[maxCidadeIndex]);













    }
}
