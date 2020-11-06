package Aditionals;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author decodigo
 */
public class ReadExcel {
    List<String> nombre = new ArrayList();
    List<String> desc = new ArrayList();
    public void leerExcel() {
        try {
            String rutaArchivoExcel = "./src/test/java/files_add/prueba.xlsx";
            FileInputStream inputStream = new FileInputStream(new File(rutaArchivoExcel));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator iterator = firstSheet.iterator();

            DataFormatter formatter = new DataFormatter();

            while (iterator.hasNext()) {
                Row nextRow = (Row) iterator.next();
                Iterator cellIterator = nextRow.cellIterator();
                int i = 0;
                while (cellIterator.hasNext()) {
                    i++;
                    Cell cell = (Cell) cellIterator.next();
                    if (i % 2 == 0) {
                        desc.add(formatter.formatCellValue(cell));
                    } else {
                        nombre.add(formatter.formatCellValue(cell));

                    }
                    //String contenidoCelda = formatter.formatCellValue(cell);
                    //   System.out.println("celda: " + contenidoCelda);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List getNombre(){
        return nombre;
    }
    public List getDesc(){
        return desc;
    }

    public static void main(String args[]) {

    }
}