import java.util.Date;

public class Task {

  private Integer Id;
  private String description;
  private String status;
  private Long createdAt;
  private Long updatedAt;


  public Task(int Id, String description, String status){
    this.Id = Id;
    this.description = description;
    this.status = status;
    this.createdAt = new Date().getTime();
  }

  public int getId(){
    return Id;
  }

  public String getDescription(){
    return description;
  }

  public String getStatus(){
    return status;
  }

  public long getCreatedAt(){
    return createdAt;
  }

  public long getupdatedAt(){
    return updatedAt;
  }

  public void setDescription(String description){
     this.description = description;
  }

  public void setStatus(String status){
    this.status = status;
  }

  public void setUpdatedAt(long updatedAt){
    this.updatedAt = updatedAt;
  }
}