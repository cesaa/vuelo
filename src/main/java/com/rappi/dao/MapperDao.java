package com.rappi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.rappi.model.TiquetModel;

@Mapper
public interface MapperDao {

	@Select("SELECT ITINERARYID, NAME, DEPARTUREDATE, ARRIVALDATE, CITYORIGIN, CITYDESTINATION, BAGGAGE, COST, DEPARTUREHOUR, ARRIVALHOUR FROM VUELOS")
	List<TiquetModel> getTiquets();
	
	@Select("SELECT ITINERARYID, NAME, DEPARTUREDATE, ARRIVALDATE, CITYORIGIN, CITYDESTINATION, BAGGAGE, COST, DEPARTUREHOUR, ARRIVALHOUR FROM VUELOS WHERE ITINERARYID = #{id}")
	TiquetModel getTiquetById(@Param("id") Long id);
	
	Integer setTiquet(@Param("tiquet") TiquetModel tiquet);
}
