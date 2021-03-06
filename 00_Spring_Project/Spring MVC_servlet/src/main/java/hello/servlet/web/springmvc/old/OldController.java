package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 옛날에 쓰던 spring MVC Controller
// spring bean의 이름을 url에 맞춰서 지정
@Component("/springmvc/old-controller")
public class OldController implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");

        // WEB-INF 밑의 new-form(논리적인 이름)
        return new ModelAndView("new-form");
    }
}
