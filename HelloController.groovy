// HelloController.groovy within https://github.com/wilsonmar/spring-servers.git
@Controller
class Example {
	@RequestMapping("/")
	@ResponseBody
	public String helloWorld(){
	    return "Hello Spring Boot!";
	}
}