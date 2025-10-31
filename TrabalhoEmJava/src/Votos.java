public class Votos {
    private int age;
    private int fab;
    private int jor;
    private int luc;
    private int lui;
    private int mar;
    private int ale;
    private int gel;
    private int mag;
    private int pir;
    private int van;
    private int wil;

    private int bol;
    private int had;
    private int cir;
    private int bou;
    private int dac;
    private int msi;
    private int alc;
    private int dia;
    private int mei;
    private int amo;

    private int nulosSen;
    private int brancosSen;
    private int nulosPres;
    private int brancosPres;

   public int somaAge(){
    return ++age;
   }
   public int somaFab(){
    return ++fab;
   }
   public int somaJor(){
    return ++jor;
   }
   public int somaLuc(){
    return ++luc;
   }
   public int somaLui(){
    return ++lui;
   }
   public int somaMar(){
    return ++mar;
   }
   public int somaAle(){
    return ++ale;
   }
   public int somaGel(){
    return ++gel;
   }
   public int somaMag(){
    return ++mag;
   }
   public int somaPir(){
    return ++pir;
   }
   public int somaVan(){
    return ++van;
   }
   public int somaWil(){
    return ++wil;
   }

   public int somaBol(){
    return ++bol;
   }
   public int somaHad(){
    return ++had;
   }
   public int somaCir(){
    return ++cir;
   }
   public int somaBou(){
    return ++bou;
   }
   public int somaDac(){
    return ++dac;
   }
   public int somaMsi(){
    return ++msi;
   }
   public int somaAlc(){
    return ++alc;
   }
   public int somaDia(){
    return ++dia;
   }
   public int somaMei(){
    return ++mei;
   }
   public int somaAmo(){
    return ++amo;
   }

   public int somaNuloSen(){ return ++nulosSen; }
   public int somaBrancoSen(){ return ++brancosSen; }
   public int somaNuloPres(){ return ++nulosPres; }
   public int somaBrancoPres(){ return ++brancosPres; }

   public int getAge() {
        return age;
    }
    public int getFab() {
        return fab;
    }
    public int getJor() {
        return jor;
    }
    public int getLuc() {
        return luc;
    }
    public int getLui() {
        return lui;
    }
    public int getMar() {
        return mar;
    }
    public int getAle() {
        return ale;
    }
    public int getGel() {
        return gel;
    }
    public int getMag() {
        return mag;
    }
    public int getPir() {
        return pir;
    }
    public int getVan() {
        return van;
    }
    public int getWil() {
        return wil;
    }

    public int getBol() { return bol; }
    public int getHad() { return had; }
    public int getCir() { return cir; }
    public int getBou() { return bou; }
    public int getDac() { return dac; }
    public int getMsi() { return msi; }
    public int getAlc() { return alc; }
    public int getDia() { return dia; }
    public int getMei() { return mei; }
    public int getAmo() { return amo; }

    public int getNulosSen() { return nulosSen; }
    public int getBrancosSen() { return brancosSen; }
    public int getNulosPres() { return nulosPres; }
    public int getBrancosPres() { return brancosPres; }

    public int getTotalValidSen(){
        return age+fab+jor+luc+lui+mar+ale+gel+mag+pir+van+wil;
    }
    public int getTotalValidPres(){
        return bol+had+cir+bou+dac+msi+alc+dia+mei+amo;
    }

}