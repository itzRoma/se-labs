package com.lab111.test;

public class SubSystem {
    private File[] files;
    private Directory[] directories;

    public SubSystem() {
        files = new File[3];
        directories = new Directory[2];
        create();
    }

    private void create() {
        for (int i = 0; i < files.length; i++) {
            files[i] = new File("filePath" + (i + 1));
        }
        for (int i = 0; i < directories.length; i++) {
            directories[i] = new Directory("directoryPath" + (i + 1));
        }
    }

    public void destroy() {
        files = null;
        directories = null;
    }

    public void show() {
        System.out.println("Files:");
        for (File file : files) {
            System.out.print("  ");
            file.path();
        }
        System.out.println("Directories:");
        for (Directory directory : directories) {
            System.out.print("  ");
            directory.path();
        }
    }
}
