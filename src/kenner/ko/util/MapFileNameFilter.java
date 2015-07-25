package kenner.ko.util;

import java.io.File;
import java.io.FilenameFilter;

public class MapFileNameFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		if(name.substring(name.length()-4, name.length()).equalsIgnoreCase(".smd")){
			return true;
		}
		return false;
	}

}
