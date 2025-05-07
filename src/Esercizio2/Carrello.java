package Esercizio2;

import java.util.ArrayList;

public class Carrello {

    private Cliente clienteAssociato;
    private ArrayList<Articolo> elencoDiArticoli;
    private int totaleCostoArticoli;

    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoDiArticoli = new ArrayList<>();
        this.totaleCostoArticoli = 0;
    }

    public int getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }

    public void setTotaleCostoArticoli(int totaleCostoArticoli) {
        this.totaleCostoArticoli = totaleCostoArticoli;
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public void setClienteAssociato(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }



    public void setElencoDiArticoli(ArrayList<Articolo> elencoDiArticoli) {
        this.elencoDiArticoli = elencoDiArticoli;
    }

    public void aggiungArticolo(Articolo articolo){
        elencoDiArticoli.add(articolo);
        totaleCostoArticoli += articolo.getPrezzo();
    }

    public void stampaCarrello(){
        System.out.println("Cliente: " + clienteAssociato.getNomeCognome());
        System.out.println("Email: " + clienteAssociato.getEmail());
        System.out.println("Data iscrizione: " + clienteAssociato.getDataIscrizione());
        System.out.println("Articoli nel carrello:");

        for (int i = 0; i < elencoDiArticoli.size()  ; i++) {
            Articolo articolo = elencoDiArticoli.get(i);
            System.out.println("- " + articolo.getDescrizione() + " | Prezzo: " + articolo.getPrezzo() + "€");

        }
    }
}
