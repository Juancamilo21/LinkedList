package linkedlist;

import java.util.Scanner;

public class MainList {

    public static void main(String[] args) {
        int option, number;
        Scanner sc = new Scanner(System.in);
        List list = new List();
        Node node;
        do {
            System.out.println("Selecciona una opción");
            System.out.println("1. Agregar dato");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Ordenar lista");
            System.out.println("4. Eliminar dato");
            System.out.println("5. Buscar dato");
            System.out.println("6. Limpiar lista");
            System.out.println("7. Salir");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Agrega un numero entero:\t");
                    int data = sc.nextInt();
                    list.add(data);
                    break;

                case 2:
                    if (!list.isEmpty()) {
                        for (int i = 0; i < list.getSize(); i++) {
                            System.out.print(list.get(i).getData() + " - ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (!list.isEmpty()) {
                        list.sort();
                        System.out.println("Lista ordenada");
                    }
                    break;

                case 4:
                    if (!list.isEmpty()) {
                        System.out.print("Ingresa el dato que desea eliminar:\t");
                        number = sc.nextInt();
                        node = list.search(number);
                        if (node != null) {
                            list.remove(node);
                            System.out.println("Eliminado exitosamente");
                        } else System.out.println("El dato no existe");
                    }
                    break;

                case 5:
                    if (!list.isEmpty()) {
                        System.out.print("Ingresa el dato que desea buscar:\t");
                        number = sc.nextInt();
                        node = list.search(number);
                        if (node != null) {
                            System.out.println("El dato existe");
                        } else System.out.println("El dato no existe");
                    }
                    break;

                case 6:
                    if (!list.isEmpty()) {
                        list.clean();
                        System.out.println("Lista limpiada");
                    }
                    break;
            }
        } while (option != 7);


    }

}
