package readexcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelReaderTwo {

    String path = "E:\\Workspace\\Intellij\\AutomationProject\\src\\main\\resources\\datafiles\\TestData.xlsx";

    public static ArrayList<String> getData(String path, String SheetName, String testName ) throws IOException {
        //fileInputStream argument
        ArrayList<String> a = new ArrayList<>();

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase(SheetName)) {
                XSSFSheet sheet = workbook.getSheetAt(i);

                //Identify Test cases column by scanning the 1st row
                Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
                Row firstrow = rows.next();
                Iterator<Cell> ce = firstrow.cellIterator();//row is collection of cells
                int k = 0;
                int coloumn = 0;
                while (ce.hasNext()) {
                    Cell value = ce.next();

                    if (value.getStringCellValue().equalsIgnoreCase("TestName")) {
                        coloumn = k;

                    }

                    k++;
                }
                //System.out.println(coloumn);

                ////once coloumn is identified then scan entire testcase column to identify purchase testcase row
                while (rows.hasNext()) {

                    Row r = rows.next();

                    if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testName)) {

                        ////after you grab purchase testcase row = pull all the data of that row and feed into test

                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {
                            Cell c = cv.next();
                            if (c.getCellTypeEnum() == CellType.STRING) {

                                a.add(c.getStringCellValue());
                            } else {

                                a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

                            }
                        }
                    }


                }


            }
        }
        return a;

    }

    public static void main(String[] args) throws IOException {
        //System.out.println(System.getProperty("user.dir"));

       ArrayList<String> data = ExcelReaderTwo.getData(System.getProperty("user.dir") + "\\src\\main\\resources\\datafiles\\TestData.xlsx", "TC_001","Sanity");

        for (String d : data ) {
            System.out.println("Data from excel for Smoke Test is :: "+d);
        }


    }

}
