import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {

  public static List<String> fileToStringsList(String filePath) {
    List<String> stringsList = new ArrayList<>();
    try {
      File myTextFile = new File(filePath);
      Scanner myReader = new Scanner(myTextFile);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine().replace("\"", "");
        data = data.replace(" => ", ":");
        stringsList.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Error when reading from file!");
      e.printStackTrace();
    }
    return stringsList;
  }

  public static List<Holiday> createHolidaysCollection(List<String> targetList) {
    List<Holiday> holidaysList = new ArrayList<>();
    
    for (String listItem : targetList) {
      String[] splittedString = listItem.split(":");
      holidaysList.add(new Holiday(splittedString[0], splittedString[1]));
    }

    return holidaysList;
  }
  
  public static void main(String[] args) {
    String targetFilePath = "lista_feriados.txt";
    List<String> holidaysStringList = fileToStringsList(targetFilePath);
    
    HolidaysCollection myHolidays = new HolidaysCollection(createHolidaysCollection(holidaysStringList));

    myHolidays.getAllHolidays();
    myHolidays.getHolidayByDate("12/10/2023");
    myHolidays.getHolidayByDate("05/11/2023");
    
  }
}