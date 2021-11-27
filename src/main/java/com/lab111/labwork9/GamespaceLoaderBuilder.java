package com.lab111.labwork9;

/**
 * Builder class for GamespaceLoader class.
 *
 * @author - Roma Bondarenko
 */
public class GamespaceLoaderBuilder implements Builder {
    private GamespaceLoader res;
    private int height;
    private int width;
    private String biome;
    private int level;
    private int enemiesNum;
    private int[] startPos;

    public GamespaceLoaderBuilder() {
        reset();
    }

    public void reset() {
        height = 0;
        width = 0;
        level = 0;
        enemiesNum = 0;
        startPos = new int[]{0, 0};
        biome = null;
        res = new GamespaceLoader(height, width, biome, level, enemiesNum, startPos[0], startPos[1]);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setBiome(String name) {
        this.biome = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setEnemiesNum(int num) {
        this.enemiesNum = num;
    }

    public void setStartPos(int x, int y) {
        this.startPos = new int[]{x, y};
    }

    public GamespaceLoader result() {
        res = new GamespaceLoader(height, width, biome, level, enemiesNum, startPos[0], startPos[1]);
        return res;
    }
}