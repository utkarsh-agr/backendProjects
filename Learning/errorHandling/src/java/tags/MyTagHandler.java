package tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;
import java.util.Date;

public class MyTagHandler extends TagSupport {

    @Override
    public int doStartTag() throws JspException {

        try {
            //Here we will write task that we want out tag to do

            //First fetch the reference of out
            JspWriter out=pageContext.getOut();
            out.println("<h1>This line is coming from my tag</h1>");
            out.println("<p>This is custom paragraph</p>");
            out.println("<br>");
            out.println(new Date().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SKIP_BODY;
    }

}
