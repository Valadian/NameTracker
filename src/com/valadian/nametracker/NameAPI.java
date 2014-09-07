package com.valadian.nametracker;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public class NameAPI {
	public static UUID getUUID(String playerName) {
		return NameTrackerPlugin.associations.getUUID(playerName);
	}
	
	public static String getCurrentName(UUID uuid) {
		return NameTrackerPlugin.associations.getCurrentName(uuid);
	}
}
