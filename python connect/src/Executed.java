import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Executed {
	public static void main(String[] args) {
		System.out.println("Escuchando");
	}

	public void executedExample(){
		Process p;
		try {
			String[] cmd = { "/bin/bash", "-c", "python helloword.py '" };
			p = Runtime.getRuntime().exec(cmd);
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String s = br.readLine();
			System.out.println(s);
			p.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
