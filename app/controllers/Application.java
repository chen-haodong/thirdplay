package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.joda.time.Days;

import static scala.collection.JavaConversions.asScalaBuffer;
public class Application extends Controller{

	public static Result index(){
	int level = 1;
	java.util.List<String>list = java.util.Array.asList("me","and you?","tea","for two?");
    return ok(index.render("It Works",level,asScalaBuffer(list)));
	}
}