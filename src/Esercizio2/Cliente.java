package Esercizio2;

public class Cliente {

    private int codiceCliente;
    private String nomeCognome;
    private String email;
    private String dataIscrizione;

    public Cliente(int codiceCliente, String nomeCognome, String email, String dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }

    public void utente() {
        System.out.println("Codice cliente: " + codiceCliente);
        System.out.println("Nome e cognome: " + nomeCognome);
        System.out.println("Email: " + email);
        System.out.println("Data iscrizione: " + dataIscrizione);
    }
}
