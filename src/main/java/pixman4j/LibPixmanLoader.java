package pixman4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class LibPixmanLoader {

	private static final String LIBPIXMAN_BASE_NAME = "libpixman4j";

	public static void load() {
		final String jreArch = System.getProperty("os.arch");
		final String libName = LibPixmanLoader.LIBPIXMAN_BASE_NAME + "_" + jreArch + ".so";

		final InputStream in = LibPixmanLoader.class.getClassLoader().getResourceAsStream(libName);
		final byte[] buffer = new byte[4096];
		int read = -1;
		final File temp = new File(	new File(System.getProperty("java.io.tmpdir")),
								libName);
		final FileOutputStream fos;
		try {
			fos = new FileOutputStream(temp);
			while ((read = in.read(buffer)) != -1) {
				fos.write(	buffer,
							0,
							read);
			}
			fos.close();
			in.close();

			System.load(temp.getAbsolutePath());
		} catch (final FileNotFoundException e) {
			throw new Error(e);
		} catch (final IOException e) {
			throw new Error(e);
		}
	}
}
