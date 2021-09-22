package com.example.school;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationScoped
@ApplicationPath("mvc")
public class MyApplication extends Application {

}
