package controllers;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by lijy on 16-12-4.
 */
public class QueryController extends Controller {
        public Result query() {
            DynamicForm df = Form.form().bindFromRequest();
            String id = df.get("id");
            return ok(String.valueOf(id));
        }
}
