package tech.tgn.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.tgn.spring.model.Coche;
import tech.tgn.spring.repository.CocheRepository;

@Service
public class CochesService {
	
	@Autowired
	CocheRepository cocheRepository;
	
	@Transactional
	public List <Coche> getProducts(){
		return cocheRepository.findAll();
	}
	
	@Transactional
	public Coche findById(Integer Id){
		return cocheRepository.findOne(Id);
	}	

}
