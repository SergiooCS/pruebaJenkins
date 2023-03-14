import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class Controller {
    // Atiende petición localhost:8083/
    @RequestMapping("/")
    public ModelAndView peticionRaiz() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

}
