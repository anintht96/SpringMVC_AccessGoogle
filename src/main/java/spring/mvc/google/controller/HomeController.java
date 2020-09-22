package spring.mvc.google.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.google.commons.GooglePojo;
import spring.mvc.google.commons.GoogleUtils;

@Controller
public class HomeController {

	@Autowired
	private GoogleUtils googleUtils;

	@RequestMapping(value = { "/", "/login" })
	public ModelAndView login(@RequestParam(name = "message", required = false) String message) {
		if (message != null && !message.isEmpty()) {
			if (message.equals("logout")) {
				return new ModelAndView("login", "message", "logout");
			}
			if (message.equals("error")) {
				return new ModelAndView("login", "message", "Login Failed!");
			}
			if (message.equals("google_error")) {
				return new ModelAndView("login", "message", "Login by Google Failed!");
			}
		}

		return new ModelAndView("login");
	}

	@RequestMapping(value = "/login-google")
	public String loginGoogle(HttpServletRequest request) throws ClientProtocolException, IOException {
		String code = request.getParameter("code");

		if (code == null || code.isEmpty()) {
			return "redirect:/login?message=google_error";
		}

		String accessToken = googleUtils.getToken(code);

		GooglePojo googlePojo = googleUtils.getUserInfo(accessToken);
		UserDetails userDetails = googleUtils.buildUser(googlePojo);
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails,
				null, userDetails.getAuthorities());
		authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
		SecurityContextHolder.getContext().setAuthentication(authenticationToken);
		return "redirect:/user";
	}

	@RequestMapping(value = "/user")
	public String user() {
		return "user";
	}

	@RequestMapping(value = "/admin")
	public String admin() {
		return "admin";
	}

	@RequestMapping(value = "/403")
	public String accessDenied() {
		return "403";
	}
}
