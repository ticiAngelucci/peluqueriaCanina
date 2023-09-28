/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luca
 */
public class Turno {

    private int id_turno;
    private int id_mascota;
    private int id_servicio;
    private String hora;
    private String dia;
    private String observaciones;

    public Turno(int id_turno, int id_mascota, int id_servicio, String hora, String dia, String observaciones) {
        this.id_turno = id_turno;
        this.id_mascota = id_mascota;
        this.id_servicio = id_servicio;
        this.hora = hora;
        this.dia = dia;
        this.observaciones = observaciones;
    }

    public Turno() {
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

}
