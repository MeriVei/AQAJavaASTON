import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class AppDate {
    private String[] header;
    private int[][] date;

    public AppDate(String[] header, int[][] date) {
        this.header = header;
        this.date = date;
    }

    public static void save(AppDate data) {
        try (BufferedWriter bWriter = new BufferedWriter(new FileWriter("file.csv", false))) {
            StringBuilder line = new StringBuilder();
            if (data.getHeader().length == 1) {
                line.append(data.getHeader()[0]);
                bWriter.write(line.toString());
                bWriter.newLine();
            } else if (data.getHeader().length > 1) {
                line.append(data.getHeader()[0]);
                for (int i = 1; i < data.getHeader().length; i++) {
                    line.append(";").append(data.getHeader()[i]);
                }
                bWriter.write(line.toString());
                bWriter.newLine();
            }
            line.delete(0, line.length());
            if (data.getDate().length > 0) {
                for (int i = 0; i < data.getDate().length; i++) {
                    if (data.getDate()[i].length == 1) {
                        line.append(data.getDate()[i][0]);
                        bWriter.write(line.toString());
                        bWriter.newLine();
                    } else if (data.getDate()[i].length > 1) {
                        line.append(data.getDate()[i][0]);
                        for (int j = 1; j < data.getDate()[i].length; j++) {
                            line.append(";").append(data.getDate()[i][j]);
                        }
                        bWriter.write(line.toString());
                        bWriter.newLine();
                    }
                    line.delete(0, line.length());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static AppDate load() {
        try {
            Path path = Paths.get("file.csv");
            String line = Files.readString(path);
            String[] lines = line.split("\n");
            for (int i = 0; i < lines.length; i++) {
                if (lines[i].endsWith("\r")) {
                    lines[i] = lines[i].substring(0, lines[i].length() - 1);
                }
            }
            String[] header = lines[0].split(";");
            int[][] date = new int[lines.length - 1][];
            if (lines.length > 1) {
                for (int i = 1; i < lines.length; i++) {
                    date[i - 1] = Stream.of(lines[i].split(";")).mapToInt(Integer::parseInt).toArray();
                }
            }
            return new AppDate(header, date);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getDate() {
        return date;
    }
}
