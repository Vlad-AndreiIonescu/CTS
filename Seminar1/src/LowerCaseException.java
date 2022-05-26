
public class LowerCaseException extends Exception{

    public void lowerCaseLetters(String s){
        Exception e = new Exception();
        if(s.toLowerCase() == s){
            System.out.println("litere mici: " + s);
        }else{
            e.printStackTrace();
        }
    }

}
