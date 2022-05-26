public class UpperCaseException extends Exception{
    public void upperCaseLetters(String s){
        Exception e = new Exception();
        if(s.toUpperCase() == s){
            System.out.println("litere mari: " + s);
        }else{
            e.printStackTrace();
        }
    }
}