public class Attributes {
    private String name,gender,department;
    private float Chinese,Math,English;
    public Attributes(String name1,String gender1,String department1,float chinese1,float math1,float english1){
        name = name1;
        gender = gender1;
        department = department1;
        Chinese = chinese1;
        Math = math1;
        English = english1;
    }

    public void showinof(){
        System.out.println(this.name+"\t"+this.gender+"\t"+this.department+"\t\t"+this.Chinese+"\t"+this.Math+"\t"+this.English);
    }

    public String getName(){
        return name;
    }

    public void body(){
        System.out.println(Chinese+Math+English);
    }

    public void average(){
        System.out.println(((float)Chinese+Math+English)/3);
    }

    public float getChinese(){
        return Chinese;
    }

    public float getMath(){
        return Math;
    }

    public float getEnglish(){
        return English;
    }
}
