package ApacheIO_EXCEL;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoExcel {

    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream("System.getProperty(\"user.dir\")+\"Data/example.properties");

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet=workbook.createSheet("Data");

        XSSFRow row1 =sheet.createRow(0);
        row1.createCell(0).setCellValue("Ashish");
        row1.createCell(1).setCellValue(true);
        row1.createCell(1).setCellValue(31);

        XSSFRow row2=sheet.createRow(1);
        row2.createCell(0).setCellValue("Ayush");
        row2.createCell(0).setCellValue(true);
        row2.createCell(0).setCellValue(31);

       workbook.write(file);
       workbook.close();
       file.close();

        System.out.println("File created");


    }
}
