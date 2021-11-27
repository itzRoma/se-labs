package com.lab111.labwork9;

/**
 * GamespaceLoader class that loads Gamespace from a file.
 *
 * @author - Roma Bondarenko
 */
public class GamespaceLoader {
    private int height;
    private int width;
    private String biome;
    private int level;
    private int enemiesNum;
    private int[] startPos;

    public GamespaceLoader(int height, int width, String biome, int level, int enemiesNum, int x, int y) {
        this.height = height;
        this.width = width;
        this.biome = biome;
        this.level = level;
        this.enemiesNum = enemiesNum;
        this.startPos = new int[]{x, y};
    }

    public void analyseFile(String[] file) {
        String[] raw_data = file[1].split("\n");
        this.height = Integer.parseInt(raw_data[0]);
        this.width = Integer.parseInt(raw_data[1]);
        this.biome = raw_data[2];
        this.level = Integer.parseInt(raw_data[3]);
        this.enemiesNum = Integer.parseInt(raw_data[4]);
        this.startPos = new int[]
                {Integer.parseInt(raw_data[5]), Integer.parseInt(raw_data[6])};
    }

    public Gamespace result() {
        GamespaceBuilder res = new GamespaceBuilder();
        res.setHeight(height);
        res.setWidth(width);
        res.setBiome(biome);
        res.setLevel(level);
        res.setEnemiesNum(enemiesNum);
        res.setStartPos(startPos[0], startPos[1]);
        return res.result();
    }
}