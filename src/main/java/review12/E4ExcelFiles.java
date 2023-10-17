package review12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E4ExcelFiles {
    public static void main(String[] args) {
        String path="C:\Users\Syntax\IdeaProjects\JavaSdetBatch17\Files\Employees.xlsx";
        try(FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream)){
            Sheet sheet=  xssfWorkbook.getSheet("EmpData");
            int noOfRows=sheet.getPhysicalNumberOfRows();
            List<Map<String,String>> excelData=new ArrayList<>();
            Row headerRow=sheet.getRow(0);
            for (int i=1;i<noOfRows;i++) {
                Map<String, String> rowData = new LinkedHashMap<>();

                Row row = sheet.getRow(i);
                int noOfCells = row.getPhysicalNumberOfCells();
                fo( int j = 0;
                j < noOfCells;
                j++){
                    String key = headerRow.getCell(j).toString();
                    String value = row.getCell(j).toString();
                    rowDataMap.put(key, value);
                    //System.out.print(row.getCell(j)+" ");

                }
                excelData.add(rowDataMap);
            }
            System.out.println(excelData);
        }catch (IOException io){
            io.printStackTrace();
        }

    }
}
    }
}