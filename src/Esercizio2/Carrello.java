package Esercizio2;

import java.util.ArrayList;

public class Carrello {

    private Cliente clienteAssociato;
    private ArrayList<Articolo> elencoDiArticoli;

    public Carrello(Cliente clienteAssociato, ArrayList<Articolo> elencoDiArticoli) {
        this.clienteAssociato = clienteAssociato;
        this.elencoDiArticoli = elencoDiArticoli;
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public void setClienteAssociato(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }

    public ArrayList<Articolo> getElencoDiArticoli() {
        return elencoDiArticoli;
    }

    public void setElencoDiArticoli(ArrayList<Articolo> elencoDiArticoli) {
        this.elencoDiArticoli = elencoDiArticoli;
    }
}
