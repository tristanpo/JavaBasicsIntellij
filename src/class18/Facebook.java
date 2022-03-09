package class18;

public class Facebook {
 private String userName;
   private String passWord;
    private int age;
    void setAge(int personAge){
        if(personAge>5&& personAge<80){
            age=personAge;
        }else{
            System.out.println("Not allowed its not a" +
                    "Horse");
        }
    }

}
