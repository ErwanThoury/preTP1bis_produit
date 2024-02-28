package sio.pretp;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ListView lvProduit;
    @FXML
    private Label lblCategorie;
    @FXML
    private Label lblPrix;
    @FXML
    private Label lblDispo;
    @FXML
    private Label lblMarque;
    @FXML
    private Label lblRayon;
    @FXML
    private Label lblQuantite;
    // Creating categories
    Categorie viande = new Categorie(1, "Viande", "Rayon Viande", true);
    Categorie fruitLegume = new Categorie(2, "Fruit/Légume", "Rayon Fruits et Légumes", true);
    Categorie papeterie = new Categorie(3, "Papeterie", "Rayon Papeterie", false);

    // Creating products for Viande category
    Produit produit1 = new Produit(10.99, 5, true, "Steak de boeuf", viande, "BeefyJoy");
    Produit produit2 = new Produit(8.49, 3, false, "Poulet entier", viande, "PlumeFestin");
    Produit produit3 = new Produit(6.99, 4, true, "Côtelettes de porc", viande, "PorcDélire");
    Produit produit4 = new Produit(12.99, 2, false, "Filet mignon", viande, "MignonDélice");
    Produit produit5 = new Produit(5.49, 6, true, "Saucisse de porc", viande, "CochonSavoureux");

    // Creating products for Fruit/Légume category
    Produit produit6 = new Produit(2.99, 10, false, "Pommes", fruitLegume, "CroqPom");
    Produit produit7 = new Produit(3.49, 8, false, "Bananes", fruitLegume, "BananePlaisir");
    Produit produit8 = new Produit(1.99, 12, true, "Carottes", fruitLegume, "CroqueCaro");
    Produit produit9 = new Produit(4.99, 6, true, "Tomates", fruitLegume, "TomatoFiesta");
    Produit produit10 = new Produit(2.49, 15, false, "Salade verte", fruitLegume, "VerteDouceur");

    // Creating products for Papeterie category
    Produit produit11 = new Produit(1.99, 20, true, "Cahier", papeterie, "NoteEnjouée");
    Produit produit12 = new Produit(0.99, 30, false, "Stylos", papeterie, "EcriPlaisir");
    Produit produit13 = new Produit(3.49, 10, false, "Feuilles de papier", papeterie, "FeuilFiesta");
    Produit produit14 = new Produit(2.99, 15, true, "Crayons de couleur", papeterie, "ColoréFolies");
    Produit produit15 = new Produit(4.99, 8, true, "Classeurs", papeterie, "ClasséRangement");
    @FXML
    private Label lblNom;

    @FXML
    public void clickLvProduit(Event event) {

        Object selectedItem = lvProduit.getSelectionModel().getSelectedItem();

        if (selectedItem != null) {
            String selectedProductName = selectedItem.toString();

            if ("Steak de boeuf".equals(selectedProductName)) {
                aff(produit1);
            } else if ("Poulet entier".equals(selectedProductName)) {
                aff(produit2);
            } else if ("Côtelettes de porc".equals(selectedProductName)) {
                aff(produit3);
            } else if ("Filet mignon".equals(selectedProductName)) {
                aff(produit4);
            } else if ("Saucisse de porc".equals(selectedProductName)) {
                aff(produit5);
            } else if ("Pommes".equals(selectedProductName)) {
                aff(produit6);
            } else if ("Bananes".equals(selectedProductName)) {
                aff(produit7);
            } else if ("Carottes".equals(selectedProductName)) {
                aff(produit8);
            } else if ("Tomates".equals(selectedProductName)) {
                aff(produit9);
            } else if ("Salade verte".equals(selectedProductName)) {
                aff(produit10);
            } else if ("Cahier".equals(selectedProductName)) {
                aff(produit11);
            } else if ("Stylos".equals(selectedProductName)) {
                aff(produit12);
            } else if ("Feuilles de papier".equals(selectedProductName)) {
                aff(produit13);
            } else if ("Crayons de couleur".equals(selectedProductName)) {
                aff(produit14);
            } else if ("Classeurs".equals(selectedProductName)) {
                aff(produit15);
            }
        }
    }
    public void aff(Produit p)
    {
        String estDispo = "non";
        if (p.isEstDispo())
            estDispo = "oui";
        lblDispo.setText(estDispo);
        lblCategorie.setText(p.getLaCategorie().getNom());
        lblRayon.setText(p.getLaCategorie().getRayon());
        lblPrix.setText(Double.toString(p.getPrix()));
        lblQuantite.setText(Integer.toString(p.getLot()));
        lblMarque.setText(p.getMarque());
        lblNom.setText(p.getNom());
    }

    public void clickLvProduit(MouseEvent mouseEvent) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        lvProduit.getItems().add(produit1.getNom());
        lvProduit.getItems().add(produit2.getNom());
        lvProduit.getItems().add(produit3.getNom());
        lvProduit.getItems().add(produit4.getNom());
        lvProduit.getItems().add(produit5.getNom());
        lvProduit.getItems().add(produit6.getNom());
        lvProduit.getItems().add(produit7.getNom());
        lvProduit.getItems().add(produit8.getNom());
        lvProduit.getItems().add(produit9.getNom());
        lvProduit.getItems().add(produit10.getNom());
        lvProduit.getItems().add(produit11.getNom());
        lvProduit.getItems().add(produit12.getNom());
        lvProduit.getItems().add(produit13.getNom());
        lvProduit.getItems().add(produit14.getNom());
        lvProduit.getItems().add(produit15.getNom());
        lvProduit.getSelectionModel().selectFirst();
        clickLvProduit(null);
    }
}