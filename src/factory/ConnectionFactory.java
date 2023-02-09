package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;

	public ConnectionFactory() {
		ComboPooledDataSource combopooled = new ComboPooledDataSource();
		combopooled.setJdbcUrl("jdbc:mysql://localhost/hotelaluralatam?useTimeZone=true&serverTimeZone=UTC");
		combopooled.setUser("");
		combopooled.setPassword("");
		dataSource = combopooled;
	}
	
	public Connection recuperar() throws SQLException {
		return dataSource.getConnection();
	}
}
