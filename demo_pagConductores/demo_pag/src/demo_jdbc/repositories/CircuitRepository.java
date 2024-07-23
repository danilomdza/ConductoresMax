package demo_jdbc.repositories;

import demo_jdbc.models.Circuit;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CircuitRepository {
	
	String jdbcUrl = "jdbc:postgresql://localhost:5433/formula1";
	String user = "postgres";
	String password = "1234";
	
	public void nuevoCircuito(Circuit circuit) {
		// logica de ingreso a base de datos
		// insert into circuits......
	}
	
	public List<Circuit> getCircuitsByCountry(String countryParam){
		
		List<Circuit> circuits = new ArrayList<Circuit>();
		
		try {
			// Establecer la conexion
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			
			// Crear una sentencia
			Statement statement = conn.createStatement();
			
			// Ejecutar la consulta
			String sql = "select * from circuits where country = '" + countryParam + "'";
			ResultSet rs = statement.executeQuery(sql);
			
			// Procesar los resultados
			while(rs.next()) {
				int circuitid = rs.getInt("circuitid");
				String circuitref = rs.getString("circuitref");
				String name = rs.getString("name");
				String location = rs.getString("location");
				String country = rs.getString("country");
				
				Circuit circuit = new Circuit(circuitid, circuitref, name, location, country);
				circuits.add(circuit);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return circuits;
		
	}
	
	
	public List<Circuit> getCircuits(){
		
		List<Circuit> circuits = new ArrayList<Circuit>();
		
		try {
			// Establecer la conexion
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Se conecto a la base de datos");
			
			// Crear una sentencia
			Statement statement = conn.createStatement();
			
			// Ejecutar la consulta
			String sql = "SELECT * FROM circuits";
			ResultSet rs = statement.executeQuery(sql);
			
			// Procesar los resultados
			while(rs.next()) {
				int circuitid = rs.getInt("circuitid");
				String circuitref = rs.getString("circuitref");
				String name = rs.getString("name");
				String location = rs.getString("location");
				String country = rs.getString("country");
				
				Circuit circuit = new Circuit(circuitid, circuitref, name, location, country);
				circuits.add(circuit);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return circuits;
	}

}

