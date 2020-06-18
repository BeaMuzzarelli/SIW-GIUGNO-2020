package it.uniroma3.siw.ProgettoSIWGIUGNO2020.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.siw.ProgettoSIWGIUGNO2020.controller.session.SessionData;
import it.uniroma3.siw.ProgettoSIWGIUGNO2020.model.Project;
import it.uniroma3.siw.ProgettoSIWGIUGNO2020.model.Task;
import it.uniroma3.siw.ProgettoSIWGIUGNO2020.model.User;
import it.uniroma3.siw.ProgettoSIWGIUGNO2020.service.TaskService;

@Controller
public class TaskController {

	@Autowired
	SessionData sessionData;

	@Autowired
	TaskService taskService;


}
