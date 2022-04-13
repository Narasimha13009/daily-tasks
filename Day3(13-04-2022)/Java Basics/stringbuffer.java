package tasks;

public class stringbuffer{  
    public static void main(String[] args){  
        StringBuffer buffer=new StringBuffer("hello");  
        buffer.insert(buffer.length(),"java"); 
        System.out.println(buffer); 
        //String buf = new String("hi"); creates anew string hi
        //buf.append(" suresh");    it will show error AS their is no append operation in string 
         StringBuilder builder = new StringBuilder("hey");
         builder.append("prog"); 
         System.out.println(builder); 
    }  
}  