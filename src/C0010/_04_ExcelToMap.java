package C0010;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class _04_ExcelToMap {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("sheet1");

        // pre-requisite:Before I start  looping data (cells) first I need to identify total number of ROWS &COLUMNS

        int rows = sheet1.getPhysicalNumberOfRows();
        System.out.println(" rows =" + rows);
        int columns = sheet1.getRow(0).getLastCellNum();
        System.out.println("Columns =" + columns);



        Map<String, String> map = new LinkedHashMap<>();


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                String key = sheet1.getRow(0).getCell(j).toString();
                String value = sheet1.getRow(i).getCell(j).toString();
                 map.put(key, value);
                System.out.println(key +":" +value);// todo 2nd way

                // System.out.println(sheet1.getRow(i).getCell(j));
              //  System.out.println();



            }
           //System.out.println(map);    // 2nd way
            Set<Map.Entry<String, String>> entries = map.entrySet();  // 1st way
            for (Map.Entry entry : entries) {
                //System.out.println((entry);
                System.out.println(entry.getKey() + ":"+ entry.getValue()); // todo 3rd way
            }


        }

    }
}
