package com.ipiecoles.java.java230;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.Statement;


@Component
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {

//        String url = "jdbc:mysql://localhost:3306/entreprise?autoReconnect=true&useSSL=false";
//        String user = "root"; String pwd = "root";
//        java.sql.Connection connexion = null;
//        try {
//            connexion = java.sql.DriverManager.getConnection(url, user, pwd);
//        } catch ( java.sql.SQLException e ) {
//            //Problème de connexion à la base !
//        }
//
//        //La variable de type Statement permettra de gérer des requêtes SQL
//        Statement statement = connexion.createStatement();
//
////La variable de type ResultSet contiendra les résultats de la requêtes
//        String query = "SELECT id, nom, prenom, matricule, salaire FROM employe";
//        ResultSet resultSet = statement.executeQuery(query);
//
////On parcours un à un les résultats grâche à next() qui renvoie un booléen
////précisant s'il y a une ligne suivante dans nos résultats et récupère ce
////résultat le cas échéant (au début, son curseur est situé avant le premier élément).
//        while(resultSet.next()){
//            System.out.println("Identifiant : " + resultSet.getInt("id"));
//            System.out.println("nom : " + resultSet.getString("nom"));
//            System.out.println("prénom : " + resultSet.getString("prenom"));
//            //System.out.println("Date MC : " + resultSet.getDate("date_mise_circulation"));
//           // System.out.println("? : " + resultSet.getBoolean("inconnu"));//SQLException
//        }
//
////L'object connexion va nous permettre d'effectuer des requêtes...
//
//
////Lorsqu'on a fini de l'utiliser :
//        if(connexion != null ){
//            try {
//                connexion.close();
//            }
//            catch ( java.sql.SQLException e ) {
//                //Problème de déconnexion, ce n'est pas très grave...
//            }
//        }





    }

    public static void print(Object t) {
        System.out.println(t);
    }
}
