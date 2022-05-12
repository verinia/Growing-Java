public class WeaponsClass {
    private int crit;
    private int f_class;
    private int c_class;
    private int b_class;
    private int a_class;
    private int s_class;

    //constructor
    public WeaponsClass(){
        this.setCrit(crit);

        this.setF_class(f_class);
        this.setC_class(c_class);
        this.setB_class(b_class);
        this.setA_class(a_class);
        this.setS_class(s_class);

    }
    //set method that adds modifier to the crit to output 10 if
    //critModifier returns 85 or greater or 0 if returns less than 85
    protected void setCrit(int crit){

       this.crit = crit;
    }
    //get method
    public int getCrit(){
        return this.crit = critModifier(Main.randInt(1, 100));
    }
    //Crit damage modifier method, adds + 10 to the weapon damage indicating a critical hit.
    protected int critModifier(int getCrit){
        if(getCrit >= 91){
            return 10;
        } return 0;
    }

    /*Setting setters and getters for weapons classes.*/
    protected void setF_class(int f_class){
        this.f_class = f_class;
    }

    //Getters will return an int that is the weapons class damage.
    public int getF_class(){
        return this.f_class = (Main.randInt(0,2));
    }

    protected void setC_class(int c_class){
        this.c_class = c_class;
    }
    public int getC_class(){
        return this.c_class = (Main.randInt(2, 5) + (getCrit()-4));
    }

    protected void setB_class(int b_class){
        this.b_class = b_class;
    }
    public int getB_class(){
        return this.b_class = (Main.randInt(4, 7) + (getCrit()-3));
    }

    protected void setA_class(int a_class){
        this.a_class = a_class;
    }

    public int getA_class(){
        return this.a_class = (Main.randInt(5, 9) + (getCrit()-2));
    }

    protected void setS_class(int s_class){
        this.s_class = s_class;
    }
    public int getS_class(){
        return this.s_class = (Main.randInt(6, 12) + getCrit());
    }

}
