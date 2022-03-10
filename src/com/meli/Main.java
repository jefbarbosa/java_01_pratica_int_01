package com.meli;

public class Main {

    private static int[][] temperatureMatrix = {
            {-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}
    };

    private static String[] cities = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo",
            "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

    public static void main(String[] args) {
	    int min = 0, max = 0;

        for (int i = 0; i < temperatureMatrix.length; i++) {
            min = temperatureMatrix[i][0] < temperatureMatrix[min][0] ? i : min;
            max = temperatureMatrix[i][1] > temperatureMatrix[max][1] ? i : max;
        }

        System.out.println("Temperatura mais baixa: " + temperatureMatrix[min][0] + " em " + cities[min]);
        System.out.println("Temperatura mais alta: " + temperatureMatrix[max][1] + " em " + cities[max]);
    }
}
