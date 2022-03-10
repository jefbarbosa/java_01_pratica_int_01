package com.meli;

public class Main {

    private static int[][] temperatureMatrix = {
            {-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}
    };

    private static String[] cities = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo",
            "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

    public static void main(String[] args) {
        int min = extremeTemperatureIndex(false);
        int max = extremeTemperatureIndex(true);

        System.out.println("Temperatura mais baixa: " + temperatureMatrix[min][0] + " em " + cities[min]);
        System.out.println("Temperatura mais alta: " + temperatureMatrix[max][1] + " em " + cities[max]);
    }

    private static int extremeTemperatureIndex(boolean max) {
        int index = max ? 1 : 0 ;
        int extremeTempIndex = 0;

        for (int i = 0; i < temperatureMatrix.length; i++) {
            if (max)
                extremeTempIndex = temperatureMatrix[i][index] > temperatureMatrix[extremeTempIndex][index] ? i : extremeTempIndex;
            else
                extremeTempIndex = temperatureMatrix[i][index] < temperatureMatrix[extremeTempIndex][index] ? i : extremeTempIndex;
        }

        return extremeTempIndex;

    }
}
