package Lessions;

public class Less3{
    public static void main(String[] args){
        SuperClass3 sup = new SuperClass3(1);
        SubClass3 sub = new SubClass3("Два", 2);
        SubSubClass3 subb = new SubSubClass3(3, "три", "three");
        String one = sup.toString();
        String two = sub.toString();
        String three = subb.toString();
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
class SuperClass3{
    public int trut;
    SuperClass3(int tr){
        trut = tr;
    }
    public void setTrut(int tr){
        trut = tr;
    }
    @Override
    public String toString(){
        String returnName;
        returnName = "Class name "+getClass().getSimpleName()+"\n"+trut+" ";
        return returnName;
    }
}
class SubClass3 extends SuperClass3{
    public String ret;
    public void setZnach(int r, String tr){
        ret = tr;
        setTrut(r);
    }

    SubClass3(String tr, int r){
        super(r);
        ret = tr;
    }
    @Override
    public String toString(){
        String returnName;
        returnName = "Class name "+getClass().getSimpleName()+"\n"+
                " "+ret+" "+trut+" ";
        return returnName;
    }
}
class SubSubClass3 extends SubClass3{
    public String textThree;
    public void Nas3(String one, String two){
        textThree = one;
        setZnach(0, two);
    }

    SubSubClass3(int one, String two, String three){
        super(two,one);
        textThree = three;
    }

    @Override
    public String toString(){
        String returnName;
        returnName = "Class name "+getClass().getSimpleName()+"\n"+
                textThree+" "+ret+" "+trut+" ";
        return returnName;
    }
}