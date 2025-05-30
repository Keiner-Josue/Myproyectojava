import java.util.Scanner;

public class VentasEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numArticulos = 5;
        int numSucursales = 4;

        double[] precios = new double[numArticulos]; 
        int[][] ventas = new int[numArticulos][numSucursales]; 
        double[] recaudacionSucursales = new double[numSucursales]; 
        int[] totalPorArticulo = new int[numArticulos]; 

        System.out.println("Ingrese los precios de los " + numArticulos + " artículos:");
        for (int i = 0; i < numArticulos; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        System.out.println("\nIngrese las cantidades vendidas en cada sucursal:");
        for (int i = 0; i < numArticulos; i++) {
            for (int j = 0; j < numSucursales; j++) {
                System.out.print("Cantidad del artículo " + (i + 1) + " en la sucursal " + (j + 1) + ": ");
                ventas[i][j] = scanner.nextInt();
                totalPorArticulo[i] += ventas[i][j]; 
                recaudacionSucursales[j] += ventas[i][j] * precios[i]; 
            }
        }

        System.out.println("\nCantidad total de cada artículo vendido:");
        for (int i = 0; i < numArticulos; i++) {
            System.out.println("Artículo " + (i + 1) + ": " + totalPorArticulo[i] + " unidades");
        }

        int totalSucursal2 = 0;
        for (int i = 0; i < numArticulos; i++) {
            totalSucursal2 += ventas[i][1];
        }
        System.out.println("\nTotal de artículos vendidos en la sucursal 2: " + totalSucursal2);

        System.out.println("\nCantidad del artículo 3 vendido en la sucursal 1: " + ventas[2][0]);

        System.out.println("\nRecaudación total de cada sucursal:");
        double recaudacionTotalEmpresa = 0;
        int sucursalMayor = 0;
        double mayorRecaudacion = recaudacionSucursales[0];

        for (int j = 0; j < numSucursales; j++) {
            System.out.println("Sucursal " + (j + 1) + ": $" + recaudacionSucursales[j]);
            recaudacionTotalEmpresa += recaudacionSucursales[j];

            if (recaudacionSucursales[j] > mayorRecaudacion) {
                mayorRecaudacion = recaudacionSucursales[j];
                sucursalMayor = j + 1;
            }
        }

        System.out.println("\nRecaudación total de la empresa: $" + recaudacionTotalEmpresa);

        System.out.println("\nLa sucursal con mayor recaudación es la sucursal " + sucursalMayor + " con $" + mayorRecaudacion);

        scanner.close();
    }
}