package com.test.util;


import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class TeduStringUtils {
    public TeduStringUtils() {
    }

    /**
     * 字符串转 list
     *
     * @param values
     * @return
     */
    public static List<String> strToListRemovemarks(String values) {
        if (StringUtils.isBlank(values)) {
            return Lists.newArrayList();
        }
        if (values.indexOf("'") >= 0) {
            values.replaceAll("'", "");
        }
        return strToList(values);
    }

    /**
     * 字符串转 list
     * @param values
     * @return
     */
    public static List<String> strToList(String values) {
        if (StringUtils.isBlank(values)) {
            return Lists.newArrayList();
        }
        List<String> valueList = new ArrayList<>();
        String[] arrays = null;
        if (values.indexOf(",") >= 0) {
            arrays = values.split(",");
        } else if (values.indexOf("，") >= 0) {
            arrays = values.split("，");
        } else {
            arrays = values.split(" ");
        }
        if (0==arrays.length) {
            return Lists.newArrayList();
        }
        for (String array : arrays) {
            if (StringUtils.isNotBlank(array)) {
                valueList.add(array);
            }
        }
        return valueList;
    }
}
