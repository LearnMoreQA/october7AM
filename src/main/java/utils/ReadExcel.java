package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcel {

    public static String getData(String fileName,int sheetNo, int rowNo, int colNo) {
        XSSFWorkbook workbook = null;
        String value;
        try {
            workbook = new XSSFWorkbook(System.getProperty("user.dir")+"/src/main/resources/TestData/"+fileName+".xlsx");
            XSSFSheet sheet = workbook.getSheetAt(sheetNo);
            value = sheet.getRow(rowNo).getCell(colNo).getStringCellValue();
            System.out.println(value);
        }catch (Exception e){
           throw new RuntimeException("Please Provide Valid Excel File");
        }finally {
            try {
                workbook.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return value;
    }
}
