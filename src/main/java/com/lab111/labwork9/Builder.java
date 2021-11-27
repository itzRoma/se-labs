package com.lab111.labwork9;

/**
 * Builder for classes Gamespace and GamespaceLoader
 *
 * @author - Roma Bondarenko
 */
public interface Builder {
    void reset();
    void setHeight(int height);
    void setWidth(int width);
    void setBiome(String name);
    void setLevel(int level);
    void setEnemiesNum(int num);
    void setStartPos(int x, int y);
}