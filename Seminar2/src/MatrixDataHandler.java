import java.io.*;

public class MatrixDataHandler {
    private int[][] matrix;
    private int h;
    private int w;
    private String filename;

    public MatrixDataHandler(int h, int w, String filename) {
        this.h = h;
        this.w = w;
        this.filename = filename;
        matrix = new int[h][];
        for (int i = 0; i < h; i++) {
            matrix[i] = new int[w];
        }

        writeFile(filename, h, w, matrix);
    }

    //scriere matrice in fisier
    public void writeFile(String filename, int h, int w, int[][] matrix) {
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(h + " " + w + "\n");
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
            fw.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
    //am citit matricea din fisier si apoi doar am returnat valoarea de la pozitia ceruta
    public int getValueFromPosition(String filename, int posH, int posW) {
        matrix = readMatrixFromFile(filename);
        return matrix[posH][posW];
    }

    //citire matrice din fisier
    public int[][] readMatrixFromFile(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            h = Integer.parseInt(line.split(" ")[0]);
            w = Integer.parseInt(line.split(" ")[1]);
            int[][] matrix = new int[h][w];
            for (int i = 0; i < h; i++) {
                line = br.readLine();
                for (int j = 0; j < w; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return matrix;
    }

    public void modifyValueAndUpdateFile(String filename, int posH, int posW, int val) {
        int[][] matrix = readMatrixFromFile(filename);
        matrix[posH-1][posW-1] = val;
        int h = matrix.length;
        int w = matrix[0].length;
        writeFile(filename, h, w, matrix);
    }
}

