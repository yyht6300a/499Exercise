import static sun.security.krb5.Confounder.intValue;

public class Msg implements Comparable<Msg>{
    private char content;

    private String time;

    public Msg(char text,String time){
        this.content=text;
        this.time=time;
    }
    public Msg(){

    }
    public int compareTo(Msg other){
        String T1=this.getTime().substring(7);
        String T2=other.getTime().substring(7);
        int a=Integer.valueOf(T1).intValue();
        int b=Integer.valueOf(T2).intValue();
        return a-b;
    }
    public char getContent() {
        return this.content;
    }
    public void setContent(char content) {
        this.content = content;
    }
    public String getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String toString(){
        return "Msg{"+"content="+content+
                ",time='"+time+'\''+'}'+"\n";
    }
}
