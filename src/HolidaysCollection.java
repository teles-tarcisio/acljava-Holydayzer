import java.util.List;

public class HolidaysCollection {
  private List<Holiday> holidaysList;

  public HolidaysCollection() {}

  public HolidaysCollection(List<Holiday> holidaysList) {
    this.holidaysList = holidaysList;
  }

  public List<Holiday> getHolidays() {
    return this.holidaysList;
  }

  public void setHolidays(List<Holiday> holidays) {
    this.holidaysList = holidays;
  }

  public void add(Holiday newHoliday) {
    this.holidaysList.add(newHoliday);
  }

  public int size() {
    return this.holidaysList.size();
  }

  public void getHolidayByDate(String dateAsString) {
    for (int i = 0; i < this.size(); i++) {
      Holiday actualHoliday = this.holidaysList.get(i);
      if(actualHoliday.getDate().equals(dateAsString)) {
        System.out.println("Feriado encontrado: " + actualHoliday.getDate() + " => " + actualHoliday.getDescription());
        return;
      }
    }
    System.out.println("Não existe feriado na data informada: (" + dateAsString + ")");
  }

  public void getAllHolidays() {
    System.out.println("\t -- Lista completa de feriados: --");
    for (int i = 0; i < this.holidaysList.size(); i++) {
      System.out.println(this.holidaysList.get(i));
    }
  }

  
}
