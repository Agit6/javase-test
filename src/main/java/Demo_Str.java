public class Demo_Str {

    public static void main(String[] args) {

        String s = null;

        User user = null;

        if (s instanceof String){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

class User{}