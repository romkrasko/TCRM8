public class Cat{
    private String name;
    private String sex;
    private String breed;
    private boolean inCafe;

    //default
    public Cat(){
        inCafe=true;
    }

    //name and sex
    public Cat(String name, String sex){
        this.name=name;
        this.sex=sex;
        inCafe = true;
    }

    //all fields
    public Cat(String name, String sex, String breed, boolean inCafe){
        this.name=name;
        this.sex=sex;
        this.breed=breed;
        this.inCafe=inCafe;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isInCafe() {
        return inCafe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setInCafe(boolean inCafe) {
        this.inCafe = inCafe;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    static void takeAwayFromCafe(Cat cat) {
        cat.setInCafe(cat.isInCafe()?false:true);
    }

}