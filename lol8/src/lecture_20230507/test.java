package lecture_20230507;

public class test {
    public static void main(String[] args){
        Student a = new Student();
        a.setName("전병국");
        a.setAge(16);
        //a.informationScore = 100;

        MiddleSchoolStudent b = new MiddleSchoolStudent();
        b.setInformationScore(100);
        //b.age = 16;
        b.setName("박상현");

        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(b.getInformationScore());
        System.out.println(a.toString());
        System.out.println(b.toString());
        //System.out.println(b.informationScore);
    }
}
