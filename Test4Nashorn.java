import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test4Nashorn {

	public static void main(String[] args) {
		ScriptEngineManager scriptEnginManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEnginManager.getEngineByName("nashorn");

		String name = "Myra";
		Integer result = null;

		try {
			nashorn.eval("print('" + name + "')");

			result = (Integer) nashorn.eval("10+2");
		} catch (ScriptException e) {
			System.out.println("Error executing script: " + e.getMessage());
		}

		System.out.println(result.toString());

	}

}

/*Output
Myra
12
*/