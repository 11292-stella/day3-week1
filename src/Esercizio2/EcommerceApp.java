package Esercizio2;


public class EcommerceApp {

    public static void main(String[] args){


        Cliente a1 = new Cliente(105,"Topo gigio", "Gigio@live.it","24/06/2001");

        a1.utente();


        Carrello carrello = new Carrello(a1);

        Articolo art1 = new Articolo(101,"grattugia",50,6);
        Articolo art2 = new Articolo(102,"formaggio",20,4);
        Articolo art3 = new Articolo(103,"orsacchiotto",60,2);
        Articolo art4 = new Articolo(104,"sbirulino",70,1);

        carrello.aggiungArticolo(art1);
        carrello.aggiungArticolo(art2);
        carrello.aggiungArticolo(art3);
        carrello.aggiungArticolo(art4);

        carrello.stampaCarrello();
    }
}
