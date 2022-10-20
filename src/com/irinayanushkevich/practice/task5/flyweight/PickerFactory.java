package com.irinayanushkevich.practice.task5.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PickerFactory {

    private static final Map<String, HarvestPicker> pickers = new HashMap<>();

    public HarvestPicker getPickerByPurpose(String purpose) {
        HarvestPicker picker = pickers.get(purpose);

        if (picker == null) {
            switch (purpose) {
                case "apple":
                    System.out.println("Hiring apples picker. ");
                    picker = new ApplePicker();
                    break;
                case "pear":
                    System.out.println("Hiring pears picker. ");
                    picker = new PearPicker();
                    break;
            }
            pickers.put(purpose, picker);
        }
        return picker;
    }
}
