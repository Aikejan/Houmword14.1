public class Father {
    private  String Profession;

    public Father(String profession) {
        Profession = profession;
    }

    public String getProfession() {
        return Profession;
    }
    public void professions(){
        System.out.println("IT");
    }

    @Override
    public String toString() {
        return "Father{" +
                "Profession='" + Profession + '\'' +
                '}';
    }
}
