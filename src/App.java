import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {

  public static List<Holiday> generateHolidaysList(String filePath) {
    //List<String> holidaysList = new ArrayList<>();
    List<Holiday> holidaysList = new ArrayList<>();
    try {
      File myTextFile = new File(filePath);
      Scanner myReader = new Scanner(myTextFile);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine().replace("\"", "");
        String[] splittedLine = data.split(" => ");
        holidaysList.add(new Holiday(splittedLine[0], splittedLine[1]));
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Error when reading from file!");
      e.printStackTrace();
    }
    return holidaysList;
  }
  
  public static void main(String[] args) {
    List<Holiday> myHolidaysList = new ArrayList<>();
    String targetFilePath = "lista_feriados.txt";
    myHolidaysList = generateHolidaysList(targetFilePath);
    
    for (Holiday item : myHolidaysList) {
      System.out.println(item.getDate() + " : " + item.getDescription());      
    }
  }
}