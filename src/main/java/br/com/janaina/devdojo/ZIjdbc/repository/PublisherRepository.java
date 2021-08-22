package br.com.janaina.devdojo.ZIjdbc.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
		String sql = "INSERT INTO public.publisher (name) VALUES('%s')".formatted(publisher.getName());

		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			int rowsAffected = statement.executeUpdate(sql);
			log.info("Inserted publisher '{}' in database, rows affected '{}'", 
					publisher.getName(), rowsAffected);
			return rowsAffected;
		} catch (SQLException e) {
			log.error("Error while trying to insert publisher '{}': '{}'", publisher.getName(), e);
		}
		return 0;
	}
	
	/**
	 * Deletes a publisher's record and returns the number of rows changed.
	 * 
	 * @param id int
	 * @return number of rows changed
	 */
	public static int delete(int id) {
		String sql = "DELETE FROM public.publisher WHERE id = %d".formatted(id);

		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			int rowsAffected = statement.executeUpdate(sql);
			log.info("Deleted publisher '{}' in database, rows affected '{}'", id, rowsAffected);
			return rowsAffected;
		} catch (SQLException e) {
			log.error("Error while trying to delete publisher '{}': '{}'", id, e);
			e.printStackTrace();
		}
		return 0;
	}
	 
	/**
	 * Updates a publisher's record and returns the number of rows changed.
	 * 
	 * @param id int
	 * @return number of rows changed
	 */
	public static int update(Publisher publisher) {
		String sql = "UPDATE publisher SET name = '%s' WHERE id = %d"
				.formatted(publisher.getName(), publisher.getId());

		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			int rowsAffected = statement.executeUpdate(sql);
			log.info("Updated publisher '{}' in database, rows affected '{}'", 
					publisher.getId(), rowsAffected);
			return rowsAffected;
		} catch (SQLException e) {
			log.error("Error while trying to update publisher '{}': '{}'", publisher.getId(), e);
			e.printStackTrace();
		}
		return 0;
	}
	 
	/**
	 * Fetch all records from the publisher table.
	 * 
	 * @return List of Publisher
	 */
	public static List<Publisher> findAll() {
		String sql = "SELECT id, name FROM publisher";
		log.info("Finding all publishers...");
		List<Publisher> publishers = new ArrayList<>();

		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				Publisher publisher = Publisher
						.builder()
						.id(result.getInt("id"))
						.name(result.getString("name"))
						.build();
				publishers.add(publisher);
			}
		} catch (SQLException e) {
			log.error("Error while trying to find all publishers: '{}'", e);
		}
		return publishers;
	}
}
