public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(-1,"Stefan");
        Student s2 = new Student (-1,"Andrei");

        try{
            String data = s2.NameIdReturnException();
            System.out.println(data);
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }

        String user=s1.NameIdReturnNull();
        if(user==null){
            System.out.println("User doesn't exist");
        }
        else{
            System.out.println(user);
        }
    }
}
