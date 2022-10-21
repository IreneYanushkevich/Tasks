package com.irinayanushkevich.practice.task5.structural.flyweight_project;

import java.util.ArrayList;
import java.util.List;

public class HarvestRunner {

    public static void main(String[] args) {

        PickerFactory pickerFactory = new PickerFactory();
        List<HarvestPicker> pickers = new ArrayList<>();

        pickers.add(pickerFactory.getPickerByPurpose("apple"));
        pickers.add(pickerFactory.getPickerByPurpose("apple"));
        pickers.add(pickerFactory.getPickerByPurpose("apple"));
        pickers.add(pickerFactory.getPickerByPurpose("pear"));
        pickers.add(pickerFactory.getPickerByPurpose("pear"));
        pickers.add(pickerFactory.getPickerByPurpose("pear"));

        for (HarvestPicker picker : pickers) {
            picker.harvest();
        }
    }
}
