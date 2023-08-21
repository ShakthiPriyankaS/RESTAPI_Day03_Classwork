
package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employeeentity;
import com.example.demo.Service.Employeeservice;

@RestController
public class Employeecontroller {
	

	@Autowired
	Employeeservice sser;
	
	@PostMapping("addemployee")
	public Employeeentity add(@RequestBody Employeeentity ss) {		
		return sser.saveinfo(ss);
	}
	@GetMapping("showdetails")
	public List<Employeeentity> show()
	{
		return sser.showinfo();
	}
}
