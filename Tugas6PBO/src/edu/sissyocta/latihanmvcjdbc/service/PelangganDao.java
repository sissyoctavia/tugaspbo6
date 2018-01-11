/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sissyocta.latihanmvcjdbc.service;

import edu.sissyocta.latihanmvcjdbc.entity.Pelanggan;
import edu.sissyocta.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author NIM:10116524 | Nama : Sissy Octavia | Kelas : PBO-12
 */
public interface PelangganDao {
    //CRUD
    //Get by kode_mapel

    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;

    //reload data_mapel 
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
