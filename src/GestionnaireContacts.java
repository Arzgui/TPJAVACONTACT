import java.util.ArrayList;

public class GestionnaireContacts {

    private ArrayList<Contact> contacts;

    public GestionnaireContacts() {
        contacts = new ArrayList<>();
    }

    public void ajouterContact(Contact contact) {
        contacts.add(contact);
    }

    public void afficherContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.getNom());
            System.out.println(contact.getPrenom());
            System.out.println(contact.getNumeroTelephone());
            System.out.println(contact.getAdresseEmail());
        }
    }

    public void mettreAJourContact(String nom, String prenom, String adresseEmail) {
        for (Contact contact : contacts) {
            if (contact.getNom().equals(nom) && contact.getPrenom().equals(prenom)) {
                contact.setAdresseEmail(adresseEmail);
                break;
            }
        }
    }

    public Contact chercherContact(String nom, String prenom) {
        for (Contact contact : contacts) {
            if (contact.getNom().equals(nom) && contact.getPrenom().equals(prenom)) {
                return contact;
            }
        }
        return null;
    }

    public void supprimerContact(String nom, String prenom) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getNom().equals(nom) && contacts.get(i).getPrenom().equals(prenom)) {
                contacts.remove(i);
                break;
            }
        }
    }
}
