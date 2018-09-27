package testingtemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Template {
	private String name;
	private String templ;
	private Map<String, String> variables;
	
	public Template(String templ) {
		this.templ = templ;
		this.variables = new HashMap<String, String>();
		
	}
	
	public void set(String var, String val) {
		this.variables.put(var, val);
	}
	
	public String evaluate() {
		String result = templ;
		for (Entry<String, String> entry : variables.entrySet()) {
			String regex = "\\$\\{" + entry.getKey() + "\\}";
			result = result.replaceAll(regex,  entry.getValue());
		}
		return result;
	}
	
	
}
