package com.openschool.api;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		/*String hostname = System.getenv("RDS_HOSTNAME");
		String port = System.getenv("RDS_PORT");
		String dbname = System.getenv("RDS_DB_NAME");
		String username = System.getenv("RDS_USERNAME");
		String password = System.getenv("RDS_PASSWORD");

		// Create the Flyway instance and point it to the database
		Flyway flyway =
				Flyway.configure()
						.dataSource( "jdbc:postgresql://" + hostname + ":" + port + "/" + dbname, username , password )
						.load();

		// Start the migration
		flyway.migrate();*/
	}

}
