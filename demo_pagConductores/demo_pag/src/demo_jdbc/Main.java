package demo_jdbc;


import demo_jdbc.models.DriverMaxPoint;

import demo_jdbc.models.DriverResult;
import demo_jdbc.repositories.DriverResultRepository;
import demo_jdbc.repositories.QueryRepository;

public class Main {
    public static void main(String[] args) {
        QueryRepository queryRepository = new QueryRepository();
        
        var results = queryRepository.getDriversMaxPoints();
        
        //conductores con mas puntos
        System.out.println("Conductores con más puntos:");
        for (DriverMaxPoint rs : results) {
            System.out.println(rs.getDriverName() + "\t" + rs.getPoints());
        }
    }
}	
		
//		QueryRepository queryRepository = new QueryRepository();
//		var results1 = queryRepository.getDriversMaxPoints();
//		System.out.println("\n\n");
//		for(DriverMaxPoint rs: results1) {
//			System.out.println(rs.getDriverName() + "\t" + rs.getPoints());
//		}
		
		
//		CircuitRepository circuitRepository = new CircuitRepository();
//				
//		var circuits = circuitRepository.getCircuits();
//		
//		
//		System.out.println("Total circuitos: " + circuits.size());
//		
//		String country = "Russia";
//		
//		var circuitsByCountry = circuitRepository.getCircuitsByCountry(country);
//		
//		System.out.println("Circuitos de " + country);
//		
//		for(Circuit circuit:circuitsByCountry) {
//			System.out.println(circuit.getName() + "\t" + circuit.getLocation() + "\t"+ circuit.getCountry());
//		}
		
		
//		String jdbcUrl = "jdbc:postgresql://localhost:5432/formula1";
//		String user = "postgres";
//		String password = "123";
//		
//		List<Circuit> circuits = new ArrayList();
//		
//		try {
//			// Establecer la conexion
//			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
//			System.out.println("Se conecto a la base de datos");
//			
//			// Crear una sentencia
//			Statement statement = conn.createStatement();
//			
//			// Ejecutar la consulta
//			String sql = "SELECT * FROM circuits";
//			ResultSet rs = statement.executeQuery(sql);
//			
//			// Procesar los resultados
//			while(rs.next()) {
//				int circuitid = rs.getInt("circuitid");
//				String circuitref = rs.getString("circuitref");
//				String name = rs.getString("name");
//				String location = rs.getString("location");
//				String country = rs.getString("country");
//				
//				Circuit circuit = new Circuit(circuitid, circuitref, name, location, country);
//				circuits.add(circuit);
//				
//				// System.out.println(circuitid + "\t" + circuitref + "\t"+ name + "\t" + location + "\t" + country);
//				
//			}
//			
//			
//			
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
		
		
		
		
	


