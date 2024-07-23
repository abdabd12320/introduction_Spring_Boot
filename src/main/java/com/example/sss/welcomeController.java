package com.example.sss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class welcomeController
{
    @GetMapping("/myName")
    public String name()
    {
        return "My name is Abdulrahman Bamrie";
    }
    @GetMapping("/age")
    public int age()
    {
        return 24;
    }
    @GetMapping("/check/status")
    public String status()
    {
        return "Everything OK";
    }
    @GetMapping("/health")
    public String health()
    {
        return "Server health is up and running";
    }
    @GetMapping("/names")
    public ArrayList<String> names()
    {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Ali");
        stringArrayList.add("Ahmed");
        stringArrayList.add("Sara");

        return stringArrayList;
    }
}
