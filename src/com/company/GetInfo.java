package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GetInfo {

    public String getAValueFromIndex(Map<String, String> mapName, int index) {
        List<String> toList = new ArrayList<>(mapName.values());
        return toList.get(index);
    }

    public String getAKeyFromIndex(Map<String, String> mapName, int index) {
        List<String> toList = new ArrayList<>(mapName.keySet());
        return toList.get(index);

    }
}
