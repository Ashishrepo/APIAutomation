package ApacheIO_EXCEL;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

//Excel File--->WorkBook--->Worksheet---->Row---->Cells
public class ReadFromExcel {


    public static void main(String[] args) throws IOException {

        //OPen File in Reading Mode
        FileInputStream file = new FileInputStream("System.getProperty(\"user.dir\")+\"Data/example.properties");

        //XSSFWorkbook --mapping workbook with the File
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        // XSSFSheet
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rowsCount = sheet.getLastRowNum();
        int columCount = sheet.getRow(0).getLastCellNum();


        for (int r = 0; r <= rowsCount; r++) {

            //XSSFRow
            XSSFRow currentRow = sheet.getRow(r);
            for (int c = 0; c < columCount; c++) {
//                //XSSFCell
                XSSFCell currentColoum = currentRow.getCell(c);
                System.out.println(currentColoum);

            }
        }

        workbook.close();
        file.close();

    }
}
