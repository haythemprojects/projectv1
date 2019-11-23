package com.sip.ams.controlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sip.ams.entities.*;
@Controller
public class FirstControler {

	@GetMapping("/home")
	//@ResponseBody
	public String home()
	{
	//	return "<h1>Hello Spring Boot</h1>";
		
		return "/first/home";
	}
	
	@GetMapping("/acceuil")
	//@ResponseBody
	public String acceuil(ModelMap monObj)
	{
	//	return "<h1>Hello Spring Boot</h1>";
		
		String ecole="POLYTECH";
		String formation="Spring Boot & Angular";
		monObj.put("ec", ecole);
		monObj.put("form", formation);
		
		return "/first/acceuil";
	}
	
	@GetMapping("/acceuil2")
	//@ResponseBody
	public String afficherTab(ModelMap monObj)
	{
	//	return "<h1>Hello Spring Boot</h1>";
		
//		String[] tab= {"Hello","Java","OCA","OCP"};
ArrayList<String>names=new ArrayList<>();
names.add("Amine");
names.add("Haythem");
names.add("Amina");

//			monObj.put("t", tab);

monObj.put("names", names);

		
		return "/first/acceuil";
	}
	
	@GetMapping("/animal")
	public String afficherAnimal(@RequestParam(required=false,defaultValue="Hello Spring")String frameWork,ModelMap monObj)
	{
		String ch="Vous avez chois:"+frameWork;
		monObj.put("msg", ch);
		//1 methode
//		Animal a=new Animal();
//		a.setNom("Haythem");
//		a.setAge(99);
		
//		ArrayList<Animal> animals=new ArrayList<Animal>();
//		animals.add(a);
//		monObj.put("animals",animals);
		
		//2 methode
		ArrayList<Animal> animals2=new ArrayList<Animal>();
		animals2.add(new Animal("Lion",22));
		animals2.add(new Animal("Lion2",23));
		animals2.add(new Animal("Lion3",24));
		monObj.put("animals2",animals2);
		return "/first/animal";
	}
	
	@GetMapping("/animal3")
	public String afficherNomPrenom(@RequestParam(required=false,defaultValue="Nom")String nom,@RequestParam(required=false,defaultValue="Prenom")String prenom,ModelMap monObj)
	{
//		String n="Donnez nom:"+nom;
//		String p="Donnez prenom:"+prenom;
//		monObj.put("n", n);
//		monObj.put("p", p);
		//Ou
		String ch="Binvenu"+nom+":"+prenom;
		monObj.put("msg",ch);
		return "/first/animal";
	}
}

