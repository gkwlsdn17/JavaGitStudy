import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import 자동: ctrl + shift + o
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path filepath = Paths.get("d:\\a.txt");
		BufferedWriter bw = null;
		try {
			bw=Files.newBufferedWriter(filepath);
			bw.write("aaa\n");
			bw.write("bbb");
			bw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
