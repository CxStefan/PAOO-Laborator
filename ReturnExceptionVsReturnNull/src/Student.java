public class Student {
    int id;
    String name;

    Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public String NameIdReturnException() throws Exception{
        if(id<=0){
            throw new Exception("Student id must be greater than 0");
        }
        return "Student " + id + " " + name;        //Return exception -
        // must use try catch
    }

    public String NameIdReturnNull(){
        if(id<=0){
            return null; //Return null
        }
        return "Student " + id + " " + name;
    }
}
