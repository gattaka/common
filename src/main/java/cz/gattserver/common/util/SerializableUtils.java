package cz.gattserver.common.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializableUtils {

	/**
	 * Vezme list a zaručí, že bude vrácen jako {@link Serializable}
	 * {@link ArrayList}. Může vrátit jinou instanci, nicméně se stejnými
	 * referencemi.
	 * 
	 * @param list
	 * @return
	 */
	public static <T> ArrayList<T> ensureArrayList(List<T> list) {
		if (list instanceof ArrayList)
			return (ArrayList<T>) list;
		return new ArrayList<>(list);
	}

}
