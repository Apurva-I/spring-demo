package apurva.com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld 
{
@RequestMapping("/")
public String hel()
{
	return "Hello apurva";
}
}
