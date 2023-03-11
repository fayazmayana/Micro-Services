
@RestController
public class StudentRestController {

public Student getStudentDetails(String studId){

  return new Student(001,"fayaz","Bangalore");
}
}
