public class Pentagon extends Shape{
private int allside;

    public int getAllside() {
        return allside;
    }
    public Pentagon(){

    }

    public void setAllside(int allside) {
        this.allside = allside;
    }

    @Override
    public String toString() {
        return "Pentagon: " +
                "allside: " + allside ;
    }

    @Override
    public void getPerimetr() {
        int res=5*allside;
        System.out.println(res); ;
    }
}
