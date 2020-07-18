import java.io.FileWriter;
import java.util.Arrays;

public class DataCSV {

    public static void main(String[]args) throws Exception {

        String csvFile = "D:/workspace/CoinGecko/src/test.csv";
        FileWriter writer = new FileWriter(csvFile);

        writeToCsvFile.writeLine(writer, Arrays.asList("a", "b", "c", "d"));

       //custom separator + quote
        writeToCsvFile.writeLine(writer, Arrays.asList("aaa", "bb,b", "cc,c"), ',', '"');

       //custom separator + quote
        writeToCsvFile.writeLine(writer, Arrays.asList("aaa", "bbb", "cc,c"), '|', '\'');

       //double-quotes
        writeToCsvFile.writeLine(writer, Arrays.asList("aaa", "bbb", "cc\"c"));


        writer.flush();
        writer.close();

    }

}