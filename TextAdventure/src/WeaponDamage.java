public class WeaponDamage {
    private int crit;
    private int f_Class;
    private int c_Class;
    private int b_Class;
    private int a_Class;
    private int s_Class;

   public WeaponDamage(){
       this.setCrit(crit);
       this.setF_Class(f_Class);
       this.setC_Class(c_Class);
       this.setB_Class(b_Class);
       this.setA_Class(a_Class);
       this.setS_Class(s_Class);


   }
   protected void setCrit(int crit){
       this.crit = crit;
   }
   public int getCrit(){
       if(Root.randInt(1, 100) >= 92){
           return 10;
       } return 0;
   }

   protected void setF_Class(int f_class){
       this.f_Class=f_class;
   }
   public int getF_Class(){
       return this.f_Class = Root.randInt(0,2);
   }

   protected void setC_Class(int c_class){
       this.c_Class = c_class;
   }
   public int getC_Class(){
       return this.c_Class = Root.randInt((getCrit() / 2) + 2, 5 + (getCrit() - 4));
   }

    protected void setB_Class(int b_class){
        this.b_Class = b_class;
    }
    public int getB_Class(){
        return this.b_Class = Root.randInt((getCrit() / 2) + 4, 7 + (getCrit() - 3));
    }

    protected void setA_Class(int a_class){
        this.a_Class = a_class;
    }
    public int getA_Class(){
        return this.a_Class = Root.randInt((getCrit() / 2) + 5, 9 + (getCrit() - 2));
    }

    protected void setS_Class(int s_class){
        this.s_Class = s_class;
    }
    public int getS_Class(){
        return this.s_Class = Root.randInt((getCrit() / 2) + 6, 12 + getCrit());
    }

}
