package com.lab111.test;

public class File {
    private final String path;
    private int size;
    private boolean isExists;
    private boolean isOpen;

    public File(String path) {
        this.path = path;
        isExists = true;
        size = 0;
    }

    public void open(boolean createIfNotExist) {
        if (!isOpen) {
            if (createIfNotExist) {
                if (!isExists) {
                    isExists = true;
                }
                size = 0;
            } else {
                if (!isExists)
                    throw new FileIsNotExists();
            }
            isOpen = true;
        }
    }

    public void close() {
        if (isExists)
            if (isOpen) isOpen = false;
        else
            throw new FileIsNotExists();
    }

    public void delete() {
        if (isExists)
            isExists = false;
    }

    public void write(int size) {
        if (isExists) {
            if (isOpen) {
                this.size += size;
            } else {
                throw new FileIsClosed();
            }
        } else {
            throw new FileIsNotExists();
        }
    }

    public void size() {
        System.out.println(size);
    }

    public void path() {
        System.out.println(path);
    }
}
