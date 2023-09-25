import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronic.store.Student;

@RestController
@RequestMapping("/home")
public class StudentController {

	@PostMapping("/create1")
	public String createStudent(@RequestBody Student stud)
	{
		System.out.println(stud);
		return "inserted";
	}
}
