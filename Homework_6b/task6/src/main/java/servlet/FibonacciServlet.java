package servlet;


import freemarker.TemplateProvider;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/aplikacja")
public class FibonacciServlet extends HttpServlet {
    @Inject
    TemplateProvider templateProvider;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        Template template = templateProvider.getTemplate(getServletContext(), "form.ftlh");

        try {
            template.process(null, resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        int number = Integer.parseInt(req.getParameter("number"));

        Template template = templateProvider.getTemplate(getServletContext(), "output.ftlh");
        Map<String, Object> model = new HashMap<>();


        model.put("number", number);
        model.put("sequence",fibonacciSequence(number));
        model.put("value",fib(number));

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }

    }

    private int fib(int number) {
        if(number==1){
            return 0 ;
        }
        if (number == 2) {
            return 1;
        } else {
            return fib(number - 1) + fib(number - 2);
        }
    }
    private List<Integer> fibonacciSequence(int number){
        List<Integer> sequence = new ArrayList<>();
        for (int i = 1; i <= number ; i++) {
            sequence.add(fib(i));
        }
        return sequence ;
    }
}
