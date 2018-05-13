package raptorCorp.ExpenseReport.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import raptorCorp.ExpenseReport.pojos.userInformation;

/**
 * @author Samuel Vangara
 * @version 1.0.0.0.0
 */
@Controller
@SessionAttributes("userInformation")
@RequestMapping(value="/")
public class baseController {
	
	@ModelAttribute("userInformation")
	public userInformation setupForm() {
		return new userInformation();
	}

	/**
	 * @author Samuel Vangara
	 * @exception - Initial development
	 * @throws - No Customized exception
	 * @param model
	 * @return String to which ".jsp" is added, which in turn will route to login.jsp
	 */
	@RequestMapping(method = RequestMethod.GET)
    public String loginPage(@ModelAttribute("userInformation") userInformation userInfo , HttpServletRequest request, HttpServletResponse response)
    {   
        return "login";
    }
	
	@RequestMapping(value = "/register",method = RequestMethod.GET)
    public String registerPage(@ModelAttribute("userInformation") userInformation userInfo , HttpServletRequest request, HttpServletResponse response)
    {   
        return "register";
    }
}
