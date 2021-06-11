package com.rappi.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.rappi.dao.MapperDao;
import com.rappi.dao.TiquetsDao;
import com.rappi.model.ErrorModel;
import com.rappi.model.TiquetModel;
import com.rappi.model.ValidationModel;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class TiquetsService {

	@Autowired
	TiquetsDao tiquetsDao;
	
	@Autowired
	MapperDao mapperDao;
	
	public ValidationModel getAllTiquets() {
		log.info("getAllTiquets");
		ValidationModel model = new ValidationModel();
		try {
			model.setStatus(HttpStatus.OK);
			model.setResponse(mapperDao.getTiquets());
		} catch (Exception e) {
			e.printStackTrace();
			model.setStatus(HttpStatus.BAD_REQUEST);
			model.setResponse(new ErrorModel("Error al Consultar la informacion de los tiquets"));
		}
		return model;
	}
	
	public ValidationModel getTiquetsbyId(Long id) {
		log.info("getTiquetsbyId("+id+")");
		ValidationModel model = new ValidationModel();
		try {
			model.setStatus(HttpStatus.OK);
			model.setResponse(mapperDao.getTiquetById(id));
		} catch (Exception e) {
			e.printStackTrace();
			model.setStatus(HttpStatus.BAD_REQUEST);
			model.setResponse(new ErrorModel("Error al Consultar la informacion de los tiquets"));
		}
		return model;
	}

	public ValidationModel setTiquet(TiquetModel modelo) {
		log.info("setTiquet()");
		ValidationModel model = new ValidationModel();
		try {
			Integer  response = mapperDao.setTiquet(modelo);
			log.info("setTiquet("+modelo.getItineraryid()+")");
			
			if(response.equals(1)) {
				model.setStatus(HttpStatus.OK);
				Map<String, Object> testMap = Map.of("message", "Se agrego correctamente tu vuelo", "vuelo", modelo);
				model.setResponse(testMap);
			}else {
				model.setStatus(HttpStatus.OK);
				model.setResponse(model);
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.setStatus(HttpStatus.BAD_REQUEST);
			model.setResponse(new ErrorModel("Error al Consultar la informacion de los tiquets"));
		}
		return model;
	}
}
