public class Main {
    public static void main(String[] args) {

        int [] numeros = new int[5];

        numeros[0] =5;
        numeros[1] =4;
        numeros[2] =3;
        numeros[3] =2;
        numeros[4] =1;

        for (int i=0;i<5;i++){
            System.out.println(numeros[i]);
        }

        // another option

        int [] numeros_1 = {5,4,3,2,1};

        for (int i=0;i<5;i++){
            System.out.println(numeros_1[i]);
        }

    }
}