public class Monstre extends Personnage{
    
    public Monstre(String nom, int hp){
        super(nom,hp);
    }

    public void attaque(Personnage p){
        if (!(this.mort())){
            int recu = p.subitFrappe(this.getVie()/2);
            this.addVie(recu);
        }
    }
    
    public int subitFrappe(int coup){
        this.addVie(-coup);
        if (!(this.mort())){
            return -this.getVie()/2;
        }
        else{
            return 0;
        }
    }

    public int subitCharme(int coup){
        this.addVie(-coup);
        return this.getVie()/2;
    }
}
