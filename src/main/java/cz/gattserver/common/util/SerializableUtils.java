package cz.gattserver.common.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializableUtils {

	/**
	 * Vezme list a zaručí, že bude vrácen jako {@link Serializable}, například
	 * {@link ArrayList}. Může vrátit jinou instanci, nicméně se stejnými
	 * referencemi.
	 * 
	 * @param list
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <I, T extends Serializable & List<I>> T ensureArrayList(List<I> list) {
		if (list instanceof Serializable)
			return (T) list;
		ArrayList<I> arrayList = new ArrayList<>(list);
		// Protože nejde 
		return (T) arrayList;
	}

}
