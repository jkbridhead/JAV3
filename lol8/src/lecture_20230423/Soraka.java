package lecture_20230423;

public class Soraka extends champion{
    private String heal;

    public String getHeal() {
        return heal;
    }

    public void setHeal(String heal) {
        this.heal = heal;
    }

    @Override
    public String toString(){
        return String.format("This is Soraka.\nMy name is "+getUser_id()+"\nMy Skill is "+getHeal());
    }
}
