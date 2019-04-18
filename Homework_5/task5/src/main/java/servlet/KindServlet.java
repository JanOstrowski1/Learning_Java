package servlet;

import config.TemplateProvider;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@WebServlet("/infoShareAcademy")
public class KindServlet extends HttpServlet {
    @Inject
    TemplateProvider templateProvider ;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nameAndSurname="Jan Ostrowski";
        String group = "jjdd6-codeina" ;

//        resp.getWriter().println(nameAndSurname);
//        resp.getWriter().println(group);
        Template template = templateProvider.getTemplate(getServletContext(),"new.ftlh");
        Map<String,Object> model = new HashMap<>();
        model.put("name",nameAndSurname);
        model.put("group",group);
        try {
            template.process(model,resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
