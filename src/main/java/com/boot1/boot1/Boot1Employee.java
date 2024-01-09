package com.boot1.boot1;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Boot1Employee {

    private String firstName;
    private String lastName;

    Boot1Employee() {
        System.out.println("Boot1Employee constructor");
    }

    public static void main(String[] args) {
        System.out.println("Boot1Employee class");

        List<Boot1Employee> list = new ArrayList();

        list.stream()
                .filter(x-> x.getFirstName().equalsIgnoreCase("test")).count();

        list.add(new Boot1Employee());
    }
}
