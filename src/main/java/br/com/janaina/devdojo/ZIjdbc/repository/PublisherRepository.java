package br.com.janaina.devdojo.ZIjdbc.repository;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
			log.info("Inserted publisher '{}' in database, rows affected '{}'", publisher.getName(), rowsAffected);
			return rowsAffected;
		} catch (SQLException e) {
			log.error("Error while trying to insert publisher '{}': '{}'", publisher.getName(), e);
		}
		return 0;
	}

	public static void saveTransaction(List<Publisher> publishers) {
		try (Connection conn = ConnectionFactory.getConnection()){
			conn.setAutoCommit(false);
			preparedStatementSaveTransaction(conn, publishers);
			conn.commit();
		} catch(SQLException e) {
			log.error("Error trying to save publishers '{}': '{}'", publishers, e);
		}
	}

	public static void preparedStatementSaveTransaction(Connection conn, List<Publisher> publishers) 
			throws SQLException {
		String sql = "INSERT INTO publisher (name) VALUES(?)";
		boolean shouldRollback = false;
		for(Publisher p: publishers) {
			try(PreparedStatement ps = conn.prepareStatement(sql)) {
				log.info("Saving publisher '{}'", p.getName());
				ps.setString(1, p.getName());
				if(p.getName().equals("")) throw new SQLException("Can't save empty value");
				ps.execute();
			} catch(SQLException e) { 
				e.printStackTrace();
				shouldRollback = true;
			}
		}
		if(shouldRollback) {
			log.info("Starting rollback");
			conn.rollback();
		}
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
		String sql = "UPDATE publisher SET name = '%s' WHERE id = %d".formatted(publisher.getName(), publisher.getId());

		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			int rowsAffected = statement.executeUpdate(sql);
			log.info("Updated publisher '{}' in database, rows affected '{}'", publisher.getId(), rowsAffected);
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
			while (result.next()) {
				Publisher publisher = Publisher.builder().id(result.getInt("id")).name(result.getString("name"))
						.build();
				publishers.add(publisher);
			}
		} catch (SQLException e) {
			log.error("Error while trying to find all publishers: '{}'", e);
		}
		return publishers;
	}

	/**
	 * Searches for a record that has the same name as the name received in the
	 * parameter.
	 * 
	 * @return Publisher
	 */
	public static List<Publisher> findByName(String name) {
		String sql = "SELECT * FROM publisher WHERE name LIKE '%s'".formatted("%" + name + "%");
		List<Publisher> publishers = new ArrayList<>();

		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Publisher publisher = Publisher.builder().id(result.getInt("id")).name(result.getString("name"))
						.build();
				publishers.add(publisher);
			}
		} catch (SQLException e) {
			log.error("Error while trying to find publishers with name '{}': '{}'", name, e);
		}
		return publishers;
	}

	/**
	 * Shows table data.
	 * 
	 * @return void
	 */
	public static void showPublisherMetaData() {
		log.info("Showing Publisher Metadata:");
		String sql = "SELECT * FROM publisher";

		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			ResultSetMetaData resultMetaData = result.getMetaData();
			int columnCount = resultMetaData.getColumnCount();
			log.info("Columns count '{}'", columnCount);

			for (int i = 1; i <= columnCount; i++) {
				log.info("Table name '{}'", resultMetaData.getTableName(i));
				log.info("Column name '{}'", resultMetaData.getColumnName(i));
				log.info("Column size '{}'", resultMetaData.getColumnDisplaySize(i));
				log.info("Column type '{}'", resultMetaData.getColumnType(i));
			}

		} catch (SQLException e) {
			log.error("Error while trying to show all publishers: '{}'", e);
		}
	}

	/**
	 * Shows driver metadata.
	 * 
	 * @return void
	 */
	public static void showDriverMetaData() {
		log.info("Showing Driver Metadata:");
		try {
			Connection connection = ConnectionFactory.getConnection();
			DatabaseMetaData metaData = connection.getMetaData();
			// TYPE_FORWARD_ONLY: de cima para baixo
			if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
				log.info("Supports TYPE_FORWARD_ONLY");
				if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
					log.info("and Supports CONCUR_UPDATABLE");
				}
			}
			// TYPE_SCROLL_INSENSITIVE: de cima para baixo, de baixo para cima, não atualiza
			// os dados em tempo real
			if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				log.info("Supports TYPE_SCROLL_INSENSITIVE");
				if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_UPDATABLE)) {
					log.info("and Supports CONCUR_UPDATABLE");
				}
			}
			// TYPE_SCROLL_SENSITIVE: de cima para baixo, de baixo para cima, atualiza os
			// dados em tempo real
			// extremamente difícil de ser implementado
			if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				log.info("Supports TYPE_SCROLL_SENSITIVE");
				if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_UPDATABLE)) {
					log.info("and Supports CONCUR_UPDATABLE");
				}
			}
		} catch (SQLException e) {
			log.error("Error while trying to show driver metadata: '{}'", e);
		}
	}

	public static void showTypeScrollWorking() {
		String sql = "SELECT * FROM publisher";
		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet result = statement.executeQuery(sql);
			result.next();
			log.info("Last row: '{}'", result.last());
			log.info(Publisher.builder().id(result.getInt("id")).name(result.getString("name")).build());

		} catch (SQLException e) {
			log.error("Error: '{}'", e);
		}
	}

	/**
	 * Searches for a record that has the same name as the name received in the
	 * parameter and updates to UpperCase.
	 * 
	 * @return Publisher
	 */
	public static void findByNameAndUpdateToUpperCase(String name) {
		String sql = "SELECT * FROM publisher WHERE name LIKE '%s'".formatted("%" + name + "%");

		try {
			Connection connection = ConnectionFactory.getConnection();
			// precisamos adicionar os dados para dar update:
			// ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				result.updateString("name", result.getString("name").toUpperCase());
				result.updateRow();
				log.info("Updates record to UpperCase: '{}'", result.getString("name"));
			}
		} catch (SQLException e) {
			log.error("Error while trying to find publishers with name '{}': '{}'", name, e);
		}
	}

	/**
	 * Searches for a record that has the same name as the name received in the
	 * parameter, if not found, register a new record.
	 * 
	 * @return Publisher
	 */
	public static List<Publisher> findByNameAndInsertWhenNotFound(String name) {
		String sql = "SELECT * FROM publisher WHERE name LIKE '%s'".formatted("%" + name + "%");
		List<Publisher> publishers = new ArrayList<>();
		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			ResultSet result = statement.executeQuery(sql);
			if (result.next()) {
				Publisher publisher = Publisher.builder().id(result.getInt("id")).name(result.getString("name"))
						.build();
				publishers.add(publisher);
				return publishers;
			}
			result.moveToInsertRow();
			result.updateString("name", name);
			result.insertRow();
			log.info("Record not found, saved a new record: '{}'", name);
			result.beforeFirst();
			result.next();
			Publisher publisher = Publisher.builder().id(result.getInt("id")).name(result.getString("name")).build();
			publishers.add(publisher);
		} catch (SQLException e) {
			log.error("Error while trying to find/insert the publisher with name '{}': '{}'", name, e);
		}
		return publishers;
	}

	public static List<Publisher> findByNamePreparedStatement(String name) {
		String sql = "SELECT * FROM publisher WHERE name LIKE ?";
		List<Publisher> publishers = new ArrayList<>();

		try {
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement ps = createPrepareStatement(connection, sql, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Publisher publisher = Publisher.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
				publishers.add(publisher);
			}
		} catch (SQLException e) {
			log.error("Error while trying to find publishers with name '{}': '{}'", name, e);
		}
		return publishers;
	}

	private static PreparedStatement createPrepareStatement(Connection conn, String sql, String name)
			throws SQLException {
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, name);
		return ps;
	}
}
