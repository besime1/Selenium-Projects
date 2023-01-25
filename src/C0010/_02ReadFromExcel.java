package C0010;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _02ReadFromExcel {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("sheet1");
        Row headerRow = sheet1.getRow(0);
        Cell r0c5_salary = headerRow.getCell(5);
        System.out.println(r0c5_salary);

        //Task: Locate and print 'QA' from the EmployeeList.xlsx(in one line).
        Cell r1c4 = sheet1.getRow(1).getCell(4);
        System.out.println("r1c4 = " + r1c4);

        System.out.println("r1c4 Data type: " + sheet1.getRow(1).getCell(4).getCellType());

        //task: Get all Rows& Columns
        System.out.println("\n---iterate through Rows& Columns");
        //before we star looping , we need identify total number of the rows and columns.
        //First lest retrieve total number of the rows.
        int rows = sheet1.getPhysicalNumberOfRows();

        //next lest get total number of the columns
        short cols = sheet1.getRow(0).getLastCellNum();
        System.out.println("rows = " + rows);
        System.out.println("rows = " + rows);

        for (int i = 0; i < rows; i++) {   //outer loop - always counts the number of rows
            for (int j = 0; j < cols; j++) {   // inner loop - always counts the number of  columns
                Cell cellValues = sheet1.getRow(i).getCell(j);
                System.out.print(cellValues + "");
            }


            System.out.println();


        }


    }
}
