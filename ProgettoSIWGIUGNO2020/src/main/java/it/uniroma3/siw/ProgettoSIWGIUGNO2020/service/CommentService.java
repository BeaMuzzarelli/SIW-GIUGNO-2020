package it.uniroma3.siw.ProgettoSIWGIUGNO2020.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.siw.ProgettoSIWGIUGNO2020.model.Comment;
import it.uniroma3.siw.ProgettoSIWGIUGNO2020.repository.CommentRepository;

@Service
public class CommentService {

	@Autowired
	protected CommentRepository commentRepository;

	@Transactional
	public Comment saveComment(Comment comment) {
		return this.commentRepository.save(comment);
	}

}
