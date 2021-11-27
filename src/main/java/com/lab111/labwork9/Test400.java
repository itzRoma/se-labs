package com.lab111.labwork9;

/**
 * Class for testing labwork9
 *
 * @author - Roma Bondarenko
 */
public class Test400 {
    public static void main(String[] args) {
        int height = 100;
        int width = 200;

        String biome = "tundra";

        int level = 22;
        int enemiesNum = 88;

        int[] startPos = {40, 22};

        GamespaceBuilder builder = new GamespaceBuilder();
        builder.setHeight(height);
        builder.setWidth(width);
        builder.setBiome(biome);
        builder.setLevel(level);
        builder.setEnemiesNum(enemiesNum);
        builder.setStartPos(startPos[0], startPos[1]);

        Gamespace gamespace = builder.result();
        String[] file = gamespace.saveToFile("Game 1");

        GamespaceLoaderBuilder loaderBuilder = new GamespaceLoaderBuilder();
        GamespaceLoader loader = loaderBuilder.result();
        loader.analyseFile(file);

        Gamespace recreatedGamespace = loader.result();

        String[] file2 = recreatedGamespace.saveToFile("Game 2");

        System.out.println("Gamespace 1 raw data: " + file[1]);
        System.out.println("\nSaving gamespace 1 to file \"Game 1\"...\nCreating gamespace 2 from Game 1...\nSaving gamespace 2 to file \"Game 2\"...\n");
        System.out.println("Gamespace 2 raw data: " + file2[1]);
    }
}