public class Holiday {
  private String date;
  private String description;
  
  public Holiday() {}
  
  public Holiday(String date, String description) {
    this.date = date;
    this.description = description;
  }

  public String getDate() {
    return this.date;
  }
  
  public void setDate(String dateAsString) {
    this.date = dateAsString;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return this.date + ": " + this.description;
  }
 
}