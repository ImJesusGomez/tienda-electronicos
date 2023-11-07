package tiendaelectronicos;

import java.io.*;
import java.util.*;

public class TiendaElectronicos {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        boolean continuar = true;

        ArrayList<Celular> celulares = new ArrayList<>();

        ArrayList<Computadora> computadoras = new ArrayList<>();

        while (continuar) {
            System.out.println("\n\n1. Registrar Celular");
            System.out.println("2. Ver celulares");
            System.out.println("3. Registrar Computadora");
            System.out.println("4. Ver Computadora");
            System.out.println("5. Salir");

            System.out.println("Elige una opcion");
            int opcion = Integer.parseInt(teclado.readLine());

            switch (opcion) {
                case 1:
                    System.out.println("REGISTRAR CELULAR");
                    registrarCelular(celulares);
                    break;
                case 2:
                    System.out.println("VER CELULARES");
                    verCelulares(celulares);
                    break;
                case 3:
                    System.out.println("REGISTRAR COMPUTADORA");
                    registrarComputadora(computadoras);
                    break;
                case 4:
                    System.out.println("VER COMPUTADORA");
                    verComputadoras(computadoras);
                    break;
                case 5:
                    System.out.println("Gracias por usar este programa");
                    continuar = false;
                    break;

                default:
                    System.out.println("OPCION ERRONEA. ELIGE UNA OPCION VALIDA");
                    break;
            }
        }
    }

    public static void registrarCelular(ArrayList<Celular> lista) throws IOException {

        System.out.println("Ingresa la marca: ");
        String marca = teclado.readLine();

        System.out.println("Ingresa el modelo: ");
        String modelo = teclado.readLine();

        System.out.println("Ingresa el precio: ");
        double precio = Double.parseDouble(teclado.readLine());

        System.out.println("Ingresa el tamano de pantalla en pulgadas: ");
        double tamPantalla = Double.parseDouble(teclado.readLine());

        System.out.println("Ingresa el nombre del procesador: ");
        String nombreProcesador = teclado.readLine();

        System.out.println("Ingresa la cantidad de RAM en GB: ");
        int cantidadRAM = Integer.parseInt(teclado.readLine());

        System.out.println("Ingresa la capacidad de almacenamiento en GB: ");
        int capacidadAlmacenamiento = Integer.parseInt(teclado.readLine());

        System.out.println("Ingresa la cantidad de camaras: ");
        int cantidadCamaras = Integer.parseInt(teclado.readLine());

        System.out.println("Ingresa el proveedor de la antena: ");
        String proveedorAntena = teclado.readLine();

        System.out.println("Admite 5G? (1 = SI / 2 = NO)");
        int temporal = Integer.parseInt(teclado.readLine());

        boolean admite5G = true;

        if (temporal == 2) {
            admite5G = false;
        }

        Celular c = new Celular(cantidadCamaras, proveedorAntena, admite5G, tamPantalla, nombreProcesador, cantidadRAM, capacidadAlmacenamiento, marca, modelo, precio);

        lista.add(c);

        System.out.println("Celular registrado correctamente");
    }

    public static void verCelulares(ArrayList<Celular> lista) {

        //lista.isEmpty() nos dice si tenemos elementos en la lista
        if (lista.isEmpty()) {
            System.out.println("No se han registrado celulares");
        } else {
            for (Celular c : lista) {
                System.out.println("Marca: " + c.getMarca());
                System.out.println("Modelo: " + c.getModelo());
                System.out.println("Precio: $" + c.getPrecio());
                System.out.println("Tamanio de Pantalla: " + c.getTamPantalla());
                System.out.println("Procesador" + c.getNombreProcesador());
                System.out.println("RAM: " + c.getCantidadRam() + " GB");
                System.out.println("Almacenamiento: " + c.getCapacidadAlmacenamiento() + " GB");
                System.out.println("Cantidad de camaras: " + c.getCantidadCamaras());
                System.out.println("Proveedor de la antena: " + c.getProveedorAntena());

                if (c.isAdmite5G()) {
                    System.out.println("Admite 5G: Si");
                } else {
                    System.out.println("Admite 5G: No");
                }
            }
        }
    }

    public static void registrarComputadora(ArrayList<Computadora> computadoras) throws IOException {
        System.out.println("Ingresa la marca: ");
        String marca = teclado.readLine();

        System.out.println("Ingresa el modelo: ");
        String modelo = teclado.readLine();

        System.out.println("Ingresa el precio: $");
        double precio = Double.parseDouble(teclado.readLine());

        System.out.println("Ingresa el tamano de pantalla en pulgadas: ");
        double tamPantalla = Double.parseDouble(teclado.readLine());

        System.out.println("Ingresa el nombre del procesador: ");
        String nombreProcesador = teclado.readLine();

        System.out.println("Ingresa la cantidad de RAM: ");
        int cantidadRam = Integer.parseInt(teclado.readLine());

        System.out.println("Ingresa la capacidad de almacenamiento");
        int capacidadAlmacenamiento = Integer.parseInt(teclado.readLine());

        Computadora compu = new Computadora(tamPantalla, nombreProcesador, cantidadRam, capacidadAlmacenamiento, marca, modelo, precio);

        computadoras.add(compu);

        System.out.println("Computadora registrado correctamente ");
    }

    public static void verComputadoras(ArrayList<Computadora> computadoras) {

        if (computadoras.isEmpty()) {
            System.out.println("No se han registrado computadoras");
        } else {
            for (Computadora compu : computadoras) {
                System.out.println("Marca: " + compu.getMarca());
                System.out.println("Modelo: " + compu.getModelo());
                System.out.println("Precio: $" + compu.getPrecio());
                System.out.println("Tamanio de Pantalla: " + compu.getTamPantalla());
                System.out.println("Procesador" + compu.getNombreProcesador());
                System.out.println("RAM: " + compu.getCantidadRam() + " GB");
                System.out.println("Almacenamiento: " + compu.getCapacidadAlmacenamiento() + " GB");
            }
        }
    }
}
