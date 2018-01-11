/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sissyocta.latihanmvcjdbc.event;

import edu.sissyocta.latihanmvcjdbc.entity.Pelanggan;
import edu.sissyocta.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author NIM:10116553 | Nama : Ferial Rachmadiputra | Kelas : PBO-12
 */
public interface PelangganListener {

    //diambil dari model
    public void onChange(PelangganModel model);

    //diambil dari entity
    public void onInsert(Pelanggan pelanggan);

    public void onUpdate(Pelanggan pelanggan);

    public void onDelete();
}
