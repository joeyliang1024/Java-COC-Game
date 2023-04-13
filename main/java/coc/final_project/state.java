package coc.final_project;
class character{
    public character(int HP,int san,boolean hurt,boolean crazy){
        this.HP = HP;
        this.san = san;
        this.hurt = hurt;
        this.crazy = crazy;
    }
    public int HP = 14;
    public int san = 60;
    public boolean hurt = false;
    public boolean crazy = false;
}
class statue{
    int be = 0;
    public statue(){
        this.be = be;
    }
    public void setBe(int be) {
        this.be = be;
    }
}