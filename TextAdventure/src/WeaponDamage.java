public class WeaponDamage {
    private int f_Class;
    private int c_Class;
    private int b_Class;
    private int a_Class;
    private int s_Class;

    Root crit = new Root();

   public WeaponDamage(){
       this.setF_Class(f_Class);
       this.setC_Class(c_Class);
       this.setB_Class(b_Class);
       this.setA_Class(a_Class);
       this.setS_Class(s_Class);
   }

   protected void setF_Class(int f_class){
       this.f_Class = f_class;
   }
   public int getF_Class(){
       int low = 0;
       int high = 2;
       if(crit.getCrit() == 1){
           return (int) Math.floor(high * 1.5);
       } else {
           return this.c_Class = Root.randInt(low, high);
       }
   }

    //Method overloading for incorporating players' crit bonuses.
    public int getF_Class(int bonus){
        int low = 0;
        int high = 2;
        if(crit.getCrit(bonus) == 1){
            return (int) Math.floor(high * 1.5);
        } else {
            return this.c_Class = Root.randInt(low, high);
        }
    }

   protected void setC_Class(int c_class){
       this.c_Class = c_class;
   }

   //Incorporates default crit percentage at 8% crit per strike.
   public int getC_Class(){
       if(crit.getCrit() == 1){
           return (int) Math.floor(5 * 1.5);
       } else {
           return this.c_Class = Root.randInt(2, 5);
       }
   }

    //Method overloading for adding players' crit bonuses.
    public int getC_Class(int bonus){
        if(crit.getCrit(bonus) == 1){
            return (int) Math.floor(5 * 1.5);
        } else {
            return this.c_Class = Root.randInt(2, 5);
        }
    }
    protected void setB_Class(int b_class){
        this.b_Class = b_class;
    }
    public int getB_Class(){
       int low = 4;
       int high = 7;
        if(crit.getCrit() == 1){
            return (int) Math.floor(high * 1.5);
        } else {
            return this.c_Class = Root.randInt(low, high);
        }
   }

    //Method overloading for incorporating players' crit bonuses.
    public int getB_Class(int bonus){
        int low = 4;
        int high = 7;
        if(crit.getCrit(bonus) == 1){
            return (int) Math.floor(high * 1.5);
        } else {
            return this.c_Class = Root.randInt(low, high);
        }
    }

    protected void setA_Class(int a_class){
        this.a_Class = a_class;
    }
    public int getA_Class(){
        int low = 5;
        int high = 9;
        if(crit.getCrit() == 1){
            return (int) Math.floor(high * 1.5);
        } else {
            return this.c_Class = Root.randInt(low, high);
        }
    }

    //Method overloading for incorporating players' crit bonuses.
    public int getA_Class(int bonus){
        int low = 5;
        int high = 9;
        if(crit.getCrit(bonus) == 1){
            return (int) Math.floor(high * 1.5);
        } else {
            return this.c_Class = Root.randInt(low, high);
        }
    }

    protected void setS_Class(int s_class){
        this.s_Class = s_class;
    }
    public int getS_Class(){
        int low = 6;
        int high = 12;
        if(crit.getCrit() == 1){
            return (int) Math.floor(high * 1.5);
        } else {
            return this.c_Class = Root.randInt(low, high);
        }
    }
    //Method overloading for incorporating players' crit bonuses.
    public int getS_Class(int bonus){
        int low = 6;
        int high = 12;
        if(crit.getCrit(bonus) == 1){
            return (int) Math.floor(high * 1.5);
        } else {
            return this.c_Class = Root.randInt(low, high);
        }
    }

}
