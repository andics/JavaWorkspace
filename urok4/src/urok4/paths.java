package urok4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class paths {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\cpt2egi\\Desktop");
		Path file = path.resolve("TestFolder2");
		
		Files.createDirectory(file);
		File fileFile = new File(file.toString());
		Files.move(fileFile.toPath(), file);
	}
}
