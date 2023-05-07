package lecture_20230423;

public class Kayn extends champion{
    private String attack_skill;

    public String getAttack_skill() {
        return attack_skill;
    }

    public void setAttack_skill(String attack_skill) {
        this.attack_skill = attack_skill;
    }

    @Override
    public String toString(){
        return String.format("This is Kayn.\nMy name is "+getUser_id()+"\nMy Skill is "+getAttack_skill());
    }
}
