package Lessions;

public class Less2 {
    public static void main(String[] args){
        SuperClass sup = new SuperClass("SuperClass get");
        String news = sup.toString();
        System.out.println(news);

        SubClass sub1 = new SubClass(123);
        String n1 = sub1.toString();
        System.out.println(n1);

        SubClass sub2 = new SubClass("Пять");
        String n2 = sub2.toString();
        System.out.println(n2);

        SubClass sub3 = new SubClass("Пятьдесят",123);
        String n3 = sub3.toString();
        System.out.println(n3);

        SubClass sub4 = new SubClass();
        String n4 = sub4.toString();
        System.out.println(n4);
    }
}
class SuperClass{
    private String text;

    SuperClass(String strEx){
        this.text = strEx;
    }
    SuperClass(){
    }
    public int getLenght(){
        return this.text.length();
    }
    @Override
    public String toString(){
        String result;
        result = "Class name " +this.getClass().getSimpleName()+"\n"+
                " text =" + this.getText()+"\n"+
                " lenght = " + this.getLenght();
        return result;
    }

    public String getText(){
        return this.text;
    }
    public void setText(String str4){
        this.text = str4;
    }

}
class SubClass extends SuperClass{
    public int count;
    String text2;
    SubClass(){
    }
    SubClass(int count2){
        this.setCount(count2);
    }
    SubClass(String strext1){
        super(strext1);
        this.setCount(this.getLenght());
    }
    SubClass(String str2, int count3){
        this.setCount(count3);
        this.setStr(str2);
    }
    @Override
    public String toString(){
        String name;
        name = "Class name"+ getClass().getSimpleName()+"\n"+
                " int "+ this.getCount()+ "\n"+
                " string " + this.getCount();
        return name;
    }

    public String getStr2(){
        return this.text2;
    }
    public void setStr(String s){
        this.text2 = s;
    }
    public int getCount(){
        return this.count;
    }
    public void setCount(int c){
        this.count = c;
    }
}
