public abstract class medecin  {
        private String dateRecrutement;
        private String nom;
        private int id;
        private String prenom;
        private static int nbre;
    
        //many to one=>attribut de la relation
        private Hopital hopital;

        public Medecin(){
            id=++nbre;
        }
        public String getDateRecrutement(){
            return dateRecrutement;
        }
        public String getNom(){
            return nom;
        }
        
        
        public String getPrenom(){
            return prenom;
        }
        public void setDateRecrutement(String dateRecrutement){
            this.dateRecrutement= dateRecrutement;
        }
        public void setNom(String nom){
            this.nom= nom;
        }
        public void setPrenom(String prenom){
            this.prenom= prenom;
        }
        public String affiche(){
            return "dateRecrutement: "+dateRecrutement+"Nom :"+nom+"Prenom :"+prenom;
        }

}   

