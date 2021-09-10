/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import ec.edu.espe.lames.model.ElectronicMaterial;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;


/*import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;*/



/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class SystemController {

    DB Database;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    public SystemController() {
        try {

           /* ConnectionString connectionString = new ConnectionString("mongodb+srv://LAMESTech:<password>@clusterlames.22ors.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
            MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(connectionString).build();
            MongoClient mongoClient = MongoClients.create(settings);
            MongoDatabase database = mongoClient.getDatabase("test");*/

           //Mongo mongo = new Mongo("localhost", 27017);
            Mongo mongo = new Mongo("localhost", 27017);
            //mongodb+srv://LAMESTech:<password>@clusterlames.22ors.mongodb.net/test
            Database = mongo.getDB("to user");
            collection = Database.getCollection("login");
            System.out.println("The connection has been made successfully");
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(SystemController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean add(String Product, String Fabricator, Integer Id, Integer Quantity, Integer Price) {
        ArrayList<ElectronicMaterial> electronicMaterial = new ArrayList<ElectronicMaterial>();

        electronicMaterial.add(new ElectronicMaterial(Product, Fabricator, Id, Quantity, Price));
        for (ElectronicMaterial pueC : electronicMaterial) {
            //collection.insert(pueC.)
        }
        return true;
    }

    public void view(JTextArea txtArea) {
        DBCursor cursor = collection.find();
        try {
            while (cursor.hasNext()) {
                txtArea.setText(txtArea.getText() + "\n" + cursor.next().toString());
            }
        } finally {
            cursor.close();
        }
    }
}
