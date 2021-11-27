package com.lab111.labwork9;

/**
 * Class that represents a gamespace.
 *
 * @author - Roma Bondarenko
 */
public class Gamespace {
    private final int height;
    private final int width;
    private final String biome;
    private final int level;
    private final int enemiesNum;
    private final int[] startPos;

    public Gamespace(int height, int width, String biome, int level, int enemiesNum,
                     int x, int y) {
        this.height = height;
        this.width = width;
        this.biome = biome;
        this.level = level;
        this.enemiesNum = enemiesNum;
        this.startPos = new int[]{x, y};
    }

    public String[] saveToFile(String name) {
        String fileContent = "" + height + "\n"
                + width + "\n"
                + biome + "\n"
                + level + "\n"
                + enemiesNum + "\n"
                + startPos[0] + "\n"
                + startPos[1];
        return new String[]{name, fileContent};
    }
}