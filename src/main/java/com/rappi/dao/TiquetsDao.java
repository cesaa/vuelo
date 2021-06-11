package com.rappi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rappi.model.TiquetModel;

@Repository
@Transactional
public class TiquetsDao {
	

	

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
	    this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	

	public List<TiquetModel> getTiquets() {
		return jdbcTemplate.query("select * from  vuelos", new RowMapper<TiquetModel>() {
			 @Override  
		      public TiquetModel mapRow(ResultSet rs, int rownumber) throws  SQLException    {  
				 TiquetModel m = new TiquetModel();
				 m.setItineraryid(rs.getInt(1));
				 m.setName(rs.getString(2));
				 m.setDepartureDate(rs.getDate(3));
				 m.setArrivalDate(rs.getDate(4));
				 m.setCityOrigin(rs.getString(5));
				 m.setCityDestination(rs.getString(6));
				 m.setBaggage(rs.getBoolean(7));
				 m.setCost(rs.getBigDecimal(8));
				 m.setDepartureHour(rs.getTime(9));
				 m.setArrivalHour(rs.getTime(10));
				 return m;
			 }
		});
	}



	public List<TiquetModel> getTiquetById(Long id) {
		return jdbcTemplate.query("select * from  vuelos where itineraryid = "+ id, new RowMapper<TiquetModel>() {
			 @Override  
		      public TiquetModel mapRow(ResultSet rs, int rownumber) throws  SQLException {  
				 TiquetModel m = new TiquetModel();
				 m.setItineraryid(rs.getInt(1));
				 m.setName(rs.getString(2));
				 m.setDepartureDate(rs.getDate(3));
				 m.setArrivalDate(rs.getDate(4));
				 m.setCityOrigin(rs.getString(5));
				 m.setCityDestination(rs.getString(6));
				 m.setBaggage(rs.getBoolean(7));
				 m.setCost(rs.getBigDecimal(8));
				 m.setDepartureHour(rs.getTime(9));
				 m.setArrivalHour(rs.getTime(10));
				 return m;
			 }
		});
	}

	public Integer setTiquet(TiquetModel model) {
		return jdbcTemplate.update(
			    "INSERT INTO vuelos (name, departureDate, arrivalDate, cityOrigin, cityDestination, baggage, cost, departureHour, arrivalHour) VALUES(?,?,?,?,?,?,?,?,?)",
			    new Object[]{model.getName(), model.getDepartureDate(), model.getArrivalDate(), model.getCityOrigin(), model.getCityDestination(), model.isBaggage(), model.getCost(), model.getDepartureHour(), model.getArrivalHour()}
			);
	}
}
