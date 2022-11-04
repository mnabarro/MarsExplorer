package org.mnabarro;

public class Grid {
    private final Integer[][] matrix;

    public Grid (int width, int height) {
        this.matrix = new Integer[width][height];
        for (int x=0; x<width; x++) {
            for(int y=0; y<height; y++) {
                this.matrix[x][y] = 0;
            }
        }
    }
}
