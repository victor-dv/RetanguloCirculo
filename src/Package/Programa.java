package Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Shape> list = new ArrayList<>();
        int numeroShapes;
        char ch;

        System.out.println("Digite a quantidade de shapes que deseja");
        numeroShapes = scanner.nextInt();

        for(int i =1; i < numeroShapes; i++){
            System.out.println("Shapes #" + i);
            System.out.print("Retangulo ou Circulo (r/c)");
            ch = scanner.next().charAt(0);
            System.out.print("Color (Black/Blue/Red/Pink)");
            Color color = Color.valueOf(scanner.next());
            if (ch == 'r'){
                System.out.print("Digite o tamanho da base: ");
                double width = scanner.nextDouble();
                System.out.print("Digite o tamanho da altura: ");
                double heigth = scanner.nextDouble();
                list.add(new Rectangle(color,width,heigth));
            }else {
                System.out.print("Radius");
                double radius = scanner.nextDouble();
                list.add(new Circle(color,radius));
            }
        }
            System.out.println();
            System.out.println("AREA DOS SHAPES");
            for (Shape shape : list){
                System.out.println(String.format("%.2f", shape.Area()));
            }
           scanner.close();
    }
}
