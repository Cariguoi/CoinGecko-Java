import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readToXlsx {
	
    public static void read() throws IOException {
        FileInputStream fichier = new FileInputStream(new File("D:/workspace/CoinGecko/src/test.csv"));
        //créer une instance workbook qui fait référence au fichier xlsx 
        XSSFWorkbook wb = new XSSFWorkbook(fichier);
        XSSFSheet sheet = wb.getSheetAt(0);
   
        FormulaEvaluator formulaEvaluator = 
                      wb.getCreationHelper().createFormulaEvaluator();
   
        for (Row ligne : sheet) {//parcourir les lignes
          for (Cell cell : ligne) {//parcourir les colonnes
            //évaluer le type de la cellule
            switch (formulaEvaluator.evaluateInCell(cell).getCellType())
            {
                  case Cell.CELL_TYPE_NUMERIC:
                      System.out.print(cell.getNumericCellValue() + "\t\t");
                      break;
                  case Cell.CELL_TYPE_STRING:
                      System.out.print(cell.getStringCellValue() + "\t");
                      break;
            }
          }
          System.out.println();
        }  
     }

}
