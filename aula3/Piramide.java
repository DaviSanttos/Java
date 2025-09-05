public class Piramide {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura da piramide");

        int num = sc.nextInt();
        int alt = 3;
        int espacosEsq = alt-1;
        int espacosDir = 0;
        String espEsq = "";
        String ldDir = "";

        for (int i=0; i<alt; i++) {
            for (int j=0; j < espacosEsq; j++) espEsq += "-";

            
            for (int k=0; k < espacosDir; k++) {
                ldDir += "-" + num;
            }

            System.out.println(espEsq + num + ldDir);

            espacosDir++;
            espEsq="";
            ldDir="";
            espacosEsq--;
        }        
    }
}