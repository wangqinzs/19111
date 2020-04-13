package com.st.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.st.bean.BuMen;
import com.st.bean.User;

@Controller
public class Test_Action {
	@Autowired
	User user,user2,user3;
	@Autowired
	BuMen xxb;
@RequestMapping("/index")
public String tesr() {
	System.out.println(xxb);
	return "index.jsp";
}
}
