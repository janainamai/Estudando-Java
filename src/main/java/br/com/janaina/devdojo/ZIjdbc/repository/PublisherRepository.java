package br.com.janaina.devdojo.ZIjdbc.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.janaina.devdojo.ZIjdbc.connection.ConnectionFactory;
import br.com.janaina.devdojo.ZIjdbc.domain.Publisher;
import lombok.extern.log4j.Log4j2;
 
@Log4j2
public class PublisherRepository {
	
	/**
	 * Saves a publisher's record and returns the number of rows changed.
	 * 
	 * @param publisher {@link Publisher}
	 * @return number of rows changed
	 */
	public static int save(Publisher publisher) {
		String sql = "INSERT INTO public.publisher (name) VALUES('%s')"
				.formatted(publisher.getName());

		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			int rowsAffected = statement.executeUpdate(sql);
			log.info("Database rows affected '{}'", rowsAffected);
			return rowsAffected;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
