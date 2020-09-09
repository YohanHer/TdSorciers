public class Sorcier extends Personnage {

    private double pouvoir;

    public Sorcier(String nom, int hp){
        super(nom,hp);
        this.pouvoir = Math.random();
    }

    public void attaque(Personnage p){
        if (!this.mort()){
            int recu = p.subitCharme((int)(this.getVie()*this.pouvoir));
            this.addVie(recu);
        }
    }

    public int subitFrappe(int coup){
        this.addVie(-coup);
        if (!(this.mort())){
            return -(int)(this.getVie()*this.pouvoir);
        }
        else{
            return 0;
        }
    }

    public int subitCharme(int coup){
        return 0;
    }
}