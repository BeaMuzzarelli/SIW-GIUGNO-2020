package it.uniroma3.siw.ProgettoSIWGIUGNO2020.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.siw.ProgettoSIWGIUGNO2020.model.Tag;
import it.uniroma3.siw.ProgettoSIWGIUGNO2020.repository.TagRepository;

@Service
public class TagService {

	@Autowired
	protected TagRepository tagRepository;

	@Transactional
	public Tag saveTag(Tag tag) {
		return this.tagRepository.save(tag);
	}

}
