/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sissyocta.latihanmvcjdbc.main;

import edu.sissyocta.latihanmvcjdbc.database.BarbershopDatabase;
import edu.sissyocta.latihanmvcjdbc.entity.Pelanggan;
import edu.sissyocta.latihanmvcjdbc.error.PelangganException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.SwingUtilities;
import edu.sissyocta.latihanmvcjdbc.service.PelangganDao;
import edu.sissyocta.latihanmvcjdbc.view.MainViewPelanggan;

/**
 *
 * @author NIM:10116553 | Nama : Ferial Rachmadiputra | Kelas : PBO-12
 */
public class Latihanmvcjdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }

            }
        });
    }
}
