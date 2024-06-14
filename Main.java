import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NormalyVip p1=new NormalyVip("14/06/2024"," "," ","",0.0);
        NormalyVip p2=new NormalyVip("14/06/2024"," "," ","",0.0);
        NormalyVip p3=new NormalyVip("14/06/2024"," "," ","",0.0);
        NormalyVip p4=new NormalyVip("14/06/2024"," "," ","",0.0);
        NormalyVip p5=new NormalyVip("14/06/2024"," "," ","",0.0);
        NormalyVip p6=new NormalyVip("14/06/2024"," "," ","",0.0);
        NormalyVip p7=new NormalyVip("14/06/2024"," "," ","",0.0);
        NormalyVip p8=new NormalyVip("14/06/2024"," "," ","",0.0);

        Scanner scanner = new Scanner(System.in);
        int op1;
        do {
            System.out.println("El Buho");
            System.out.println("Menú Costos:");
            System.out.println("1. Quito-Guayaquil Normal");
            System.out.println("2. Quito-Tulcán Normal");
            System.out.println("3. Quito-Puyo Normal");
            System.out.println("4. Quito-Riobamba Normal");
            System.out.println("5. Quito-Guayaquil VIP");
            System.out.println("6. Quito-Tulcán VIP");
            System.out.println("7. Quito-Puyo VIP");
            System.out.println("8. Quito-Riobamba VIP");
            op1=scanner.nextInt();
            switch (op1){
                case 1:
                    p1.setNormal("si");
                    p1.setCosto(20);
                    p1.setRuta("Guayaquil");
                    p1.Rutas();
                    System.out.println("Su ruta de Quito a "+p1.getRuta());

                    System.out.println("Su Costo es de: "+p1.costo);
                    break;
                case 2:
                    p2.setNormal("si");
                    p2.setCosto(17.5);
                    p2.setRuta("Tulcan");
                    p2.Rutas();
                    System.out.println("Su ruta de Quito a "+p2.getRuta());
                    System.out.println("Su Costo es de: "+p2.costo);
                    break;
                case 3:
                    p3.setNormal("si");
                    p3.setCosto(15);
                    p3.setRuta("Puyo");
                    p3.Rutas();
                    System.out.println("Su ruta de Quito a "+p3.getRuta());
                    System.out.println("Su Costo es de: "+p3.costo);
                    break;
                case 4:
                    p4.setNormal("si");
                    p4.setCosto(17.5);
                    p4.setRuta("Riobamba");
                    p4.Rutas();
                    System.out.println("Su ruta de Quito a "+p4.getRuta());
                    System.out.println("Su Costo es de: "+p4.costo);
                    break;
                case 5:
                    p5.setVIP("si");
                    p5.setCosto(20);
                    p5.setRuta("Guayaquil");
                    p5.Rutas();
                    System.out.println("Su ruta de Quito a "+p5.getRuta());
                    System.out.println("Su Costo es de: "+p5.costo);
                    break;
                case 6:
                    p6.setVIP("si");
                    p6.setCosto(17.5);
                    p6.setRuta("Tulcan");
                    p6.Rutas();
                    System.out.println("Su ruta de Quito a "+p6.getRuta());
                    System.out.println("Su Costo es de: "+p6.costo);
                    break;
                case 7:
                    p7.setVIP("si");
                    p7.setCosto(15);
                    p7.setRuta("Puyo");
                    p7.Rutas();
                    System.out.println("Su ruta de Quito a "+p7.getRuta());
                    System.out.println("Su Costo es de: "+p7.costo);
                    break;
                case 8:
                    p8.setVIP("si");
                    p8.setCosto(17.5);
                    p8.setRuta("Riobamba");
                    p8.Rutas();
                    System.out.println("Su ruta de Quito a "+p8.getRuta());
                    System.out.println("Su Costo es de: "+p8.costo);
                    break;

            }
        }while (op1!=9);

    }
}