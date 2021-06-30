package br.com.janaina.devdojo.Iexcecoes;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatchEmLinha {
	public static void main(String[] args) {

		try {
			talvezLanceException();
		} catch (SQLException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void talvezLanceException() throws SQLException, FileNotFoundException {
	}
}


