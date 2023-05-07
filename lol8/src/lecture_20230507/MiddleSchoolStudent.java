package lecture_20230507;

public class MiddleSchoolStudent extends Student{
    private int informationScore;
    public void setInformationScore(int informationScore){
        this.informationScore = informationScore;
    }
    public int getInformationScore(){
        return  informationScore;
    }

    @Override
    public String toString(){
        return String.format("Hi I'm MiddleSchool Student " + getName());
    }

}
