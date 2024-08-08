public class Main {

    public static void main(String[] arguments) {
        System.out.println("Hello World");
        User ur=new User();
        //User ur1=new User();
        ur.age=20;
        ur.Name="Prakash";
        ur.Gender="Male";
        System.out.println(ur.age+ "  "+ur.Name+"  "+ur.Gender);
        ur.Walk();
    }
    }
