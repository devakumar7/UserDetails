package com.deva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deva.model.User;
import com.deva.repo.UserRepo;

@Controller
public class UserController {
	
	@Autowired
	private UserRepo userrepo;

	
	 @RequestMapping(value="/")
	public String home()
	{
		return "reg";
	}
	 @RequestMapping(value="/register",method = RequestMethod.POST)
	 public String reg(@RequestParam Integer id,String name,@RequestParam String email,@RequestParam String password, User user, Model model)
	 {
		 /*model.addAttribute(name);
		 model.addAttribute(email);
		 model.addAttribute(password);*/
		User u1=userrepo.save(user); 
		 return "msg"; 
	 }
	 
	 /* It provides list of employees in model object */    
	    @RequestMapping("/viewuser")    
	    public String viewemp(Model model){    
	        model.addAttribute("users",userrepo.findAll());
	        return "viewuser";   
	    }    
	    
	    @RequestMapping(value="/deleteuser/{id}",method = RequestMethod.GET)    
	    public String delete(@PathVariable int id){    
	    	userrepo.deleteById(id);    
	        return "redirect:/viewuser";    
	    }     
	    
	    @RequestMapping(value="/edituser/{id}")    
	    public String edit(@PathVariable int id, Model m){    
	        User user=userrepo.findById(id).get();    
	        m.addAttribute("command",user);  
	        return "edituser";    
	    }    
	    /* It updates model object. */    
	    @RequestMapping(value="/editu",method = RequestMethod.POST)    
	    public String editsave(@RequestParam String name,@RequestParam String email,@RequestParam String password, User user,Model model){    
	       userrepo.save(user);    
	        return "redirect:/viewuser";    
	    }    

}
