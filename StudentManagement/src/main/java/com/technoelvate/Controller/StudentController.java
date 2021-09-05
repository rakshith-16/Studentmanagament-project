package com.technoelvate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.technoelvate.Controller.Service.StudentService;
import com.technoelvate.Controller.dto.Student;

@Controller
public class StudentController {
	 @Autowired
	 StudentService serv;
	
	@GetMapping(path="/login")
	public String getLogin(ModelMap map) {
		return "login";
	}
	
	
	
	@PostMapping(path="/insert")
	public String getDisplay(ModelMap map,Student student) {
		if(student!=null) {
	    serv.insertStd(student);
		map.addAttribute("mystudent", student);
		map.addAttribute("msg","successfully added");
		}else {
			map.addAttribute("msg", "not added");
		}
		return "Display";
		
	}
	
	
	@PostMapping(path="/auntheticate")
	public String getAuntheticate(ModelMap map,@RequestParam("id")int id,@RequestParam("password")int password) {
		boolean student=serv.aunthentecStd(id, password);	
		if(student==true) {

			map.addAttribute("msg","login successfully");
			return "Auntentication";
		}
		return "login";
	
	}
	@PostMapping(path="/update")
	public String getUpdate(ModelMap map,Student std) {
		if(std!=null) {
			serv.updateStd(std);
			map.addAttribute("myStudent", std);
			map.addAttribute("msg","Successfully updated");
		}
		else {
			map.addAttribute("msg", "not updated");
		}
		return "update";
	}
	
	
	@PostMapping(path="/delete")
	public String getDelete(ModelMap map,Student std) {
		if(std!=null) {
			serv.deleteStd(std);
			map.addAttribute("myStd", std);
			map.addAttribute("msg","Successfully deleted");
		}
		else {
			map.addAttribute("msg", "not deleted");
		}
		return "delete";
		}
	
	
	
	@PostMapping(path="/getstudent")
	public String getStudent(@RequestParam("id")int id,ModelMap map) { 
	Student std=serv.getStd(id);
     map.addAttribute("myStudent", std);
     return "getstudent";
	
		 
	}
	
	
	@PostMapping(path="/getallstudent")
   public String getAllStu(ModelMap map,Student std ) {
		List<Student> student=serv.getAllStd();
		map.addAttribute("myStudent",student);
		map.addAttribute("msg","hi students");
		return "GetAllStudent";
	}
	
	
	
	
	
	
	

}
