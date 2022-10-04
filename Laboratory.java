import java.util.ArrayList;

public class Laboratory {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Professor> professors;

  public Laboratory() {
  }

  public Laboratory(String name) {
    this.name = name;
    this.students = new ArrayList<Student>();
    this.professors = new ArrayList<Professor>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addMember(Student s) {
    this.students.add(s);
  }

  public void addMember(Professor p) {
    this.professors.add(p);
  }
  
  public ArrayList<String> getContactInfos() {
    // COMPLETE-ME
    // Construa um ArrayList<String> contendo informações de contato (ContactInfo)
    // de cada um dos estudantes e professores
    ArrayList<String> contatos = new ArrayList<String>();
    
    for(int i = 0; i < professors.size(); i++) {
      contatos.add(professors.get(i).getContactInfo());
    }

    for(int i = 0; i < students.size(); i++) {
      contatos.add(students.get(i).getContactInfo());
    }

    return contatos;
  }

  public boolean userExists(String userId) {
    for(int i = 0; i < professors.size(); i++) {
      if(professors.get(i).getUserId() == userId) {
        return true;
      }
    }

    for(int i = 0; i < students.size(); i++) {
      if(students.get(i).getUserId() == userId) {
        return true;
      }
    }

    return false;
  }

  public int countMembers() {
    int total = professors.size() + students.size(), aux = 0;

    for(int i = 0; i < total; i++) {
      aux++;
    }

    return aux;
  }


}