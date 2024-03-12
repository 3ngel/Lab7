package Lessions;

public class Less1 {
    public static void main(String[] args){
        SuperClassLess1 sup = new SuperClassLess1("передал в конструктор суперкласса");
        String className = sup.toString();
        System.out.println(className);

        SubClassLess1 sub = new SubClassLess1("передал в коструктор подкласса");
        String subName = sub.toString();
        System.out.println(subName);

        SubClassLess1 sub2 = new SubClassLess1("Передал в конструктор подкласса", "где два подкласса");
        String subName2 = sub2.toString();
        System.out.println(subName2);
    }

}
class SuperClassLess1{
    private String str1;
    SuperClassLess1(String strEx){
        this.str1 = strEx;
    }
    SuperClassLess1(){

    }
    @Override
    public String toString(){
        String superClassName;
        superClassName = "super"+"\n"+
                " Class name: "+this.getClass().getSimpleName()+"\n"+
                " str1 = " + this.getStr1();
        return superClassName;
    }
    public String getStr1(){
        return str1;
    }
    public void setStr1(String str1){
        this.str1= str1;
    }
}
class SubClassLess1 extends SuperClassLess1 {
    private String str2;
    private String str3;

    SubClassLess1(String strEx) {
        super(strEx);
    }

    SubClassLess1(String strEx2, String strEx3) {
        this.str2 = strEx2;
        this.str3 = strEx3;
    }

    @Override
    public String toString() {
        String StringName;
        StringName = "" + "\n" +
                "Class Name: " + this.getClass().getSimpleName() + "\n" +
                " str1 = " + this.getStr1() + "\n" +
                " str2 = " + this.str2 + "\n" +
                " str3 = " + this.str3;
        return StringName;
    }

    public String getStr3(){
        return this.str3;
    }
    public void setStr3(String str3){
        this.str3 = str3;
    }
    public String getStr2(){
        return this.str2;
    }
    public void setStr2(String str2){
        this.str2 = str2;
    }
}