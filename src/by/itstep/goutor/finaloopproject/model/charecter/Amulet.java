package by.itstep.goutor.finaloopproject.model.charecter;

import java.util.Arrays;

public class Amulet {
    private String name;
    private int[][] matrix;

    public Amulet(String name, int[][] matrix) {
        this.name = name;
        this.matrix = matrix;
    }

    public Amulet() {
    }

    public String getName() {
        return name;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        return "Amulet{" +
                "name = " + name + ", matrix=" + Arrays.toString(matrix) +
                '}';
    }
}
