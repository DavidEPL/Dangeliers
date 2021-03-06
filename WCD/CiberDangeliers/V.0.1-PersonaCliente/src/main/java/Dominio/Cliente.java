package Dominio;

import java.sql.Date;
import Presentacion.ClasePrincipal.rango;

public class Cliente extends Persona{
	/*Atributos*/
	private String nickname;
	private Date fechanacimiento;
	private double tiemporestante;
	private rango rango;
	
	/*Constructor*/
	public Cliente(String name, String apellido, String dni, String email, String nickname, Date fechanacimiento,
			double tiemporestante, Presentacion.ClasePrincipal.rango rango) {
		super(name, apellido, dni, email);
		this.nickname = nickname;
		this.fechanacimiento = fechanacimiento;
		this.tiemporestante = tiemporestante;
		this.rango = rango;
	}
	
	
	/*Getters*/
	public String getNickname() {
		return nickname;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public double getTiemporestante() {
		return tiemporestante;
	}

	public rango getRango() {
		return rango;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/*Setters*/
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public void setTiemporestante(double tiemporestante) {
		this.tiemporestante = tiemporestante;
	}

	public void setRango(rango rango) {
		this.rango = rango;
	}

	/*Para futuras versiones del programa*/
	public String calculartrestante() {
		int horas=(int)(tiemporestante);
		int minutos=(int)(((tiemporestante-(double)horas)*60));
		String horaminrestantes="Tiempo restante:"+horas+":"+minutos;
		return horaminrestantes;
	}
	
}
