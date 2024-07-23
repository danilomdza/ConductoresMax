package demo_jdbc.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import demo_jdbc.models.Season;

public class SeasonRepository {
	
	String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
	String user = "postgres";
	String password = "123";
	
		public List<Season> getSeasons(){
		
		List<Season> seasons = new ArrayList<Season>();
		
		try {
			// Establecer la conexion
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			
			// Crear una sentencia
			Statement statement = conn.createStatement();
			
			// Ejecutar la consulta
			String sql = "select * from seasons";
			ResultSet rs = statement.executeQuery(sql);
			
			// Procesar los resultados
			while(rs.next()) {
				int year = rs.getInt("year");
				
				Season season = new Season(year);
				seasons.add(season);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return seasons;
		
	}

}
